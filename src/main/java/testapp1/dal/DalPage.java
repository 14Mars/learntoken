package testapp1.dal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 分页相关的类 <br>
 * 〈功能详细描述〉
 *
 * @see [相关类/方法]（可选）
 * @since [产品 /模块版本] （可选）
 */
public class DalPage {

    private static final long serialVersionUID = -8123039538589235324L;

    /**
     * 适用于排序后取第一条数据的查询
     *
     * @return
     */
    public static DalPage getOneInstance() {
        DalPage dalPage = new DalPage();
        dalPage.setPageSize(1);
        dalPage.setCurrentPage(1);

        return dalPage;
    }

    /**
     * 创建实例
     *
     * @param pageSize
     * @param currentPage
     * @return
     */
    public static DalPage createInstance(int pageSize, int currentPage) {
        DalPage dalPage = new DalPage();
        dalPage.setPageSize(pageSize);
        dalPage.setCurrentPage(currentPage);

        return dalPage;
    }

    /**
     * 创建实例
     *
     * @param pageSize
     * @return
     */
    public static DalPage createInstance(int pageSize) {
        DalPage dalPage = new DalPage();
        dalPage.setPageSize(pageSize);
        dalPage.setCurrentPage(1);

        return dalPage;
    }

    /**
     * The Current page.
     */
    protected int currentPage = 1;
    /**
     * The Page size.
     */
    protected int pageSize = 10;
    /**
     * The Count.
     */
    protected long count;
    /**
     * The Pages.
     */
    protected int pages;
    /**
     * The Index.
     */
    protected int index;

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Instantiates a new Dal page.
     */
    public DalPage() {
    }

    /**
     * 获取当前页面 <br>
     *
     * @return the current page
     */
    public int getCurrentPage() {
        return this.currentPage;
    }

    /**
     * 设置当前页面 <br>
     *
     * @param currentPage the current page
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * 获取页面大小 <br>
     *
     * @return the page size
     */
    public int getPageSize() {
        return this.pageSize;
    }

    /**
     * 设置页面大小 <br>
     *
     * @param pageSize the page size
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获取数量 <br>
     *
     * @return the count
     */
    public long getCount() {
        return this.count;
    }

    /**
     * 设置数量 <br>
     *
     * @param count the count
     */
    public void setCount(long count) {
        this.count = count;
        if (count > 0L) {
            this.pages = (int) (this.count / (long) this.pageSize);
            if (this.count % (long) this.pageSize > 0L) {
                ++this.pages;
            }

            if (this.currentPage > this.pages) {
                this.currentPage = this.pages;
            }

            this.index = (this.currentPage - 1) * this.pageSize;
        }
    }

    /**
     * 获取Pages <br>
     *
     * @return the pages
     */
    public int getPages() {
        return this.pages;
    }

    /**
     * 获取Indexes <br>
     *
     * @return the index
     */
    public int getIndex() {
        return this.index;
    }

    /**
     * 获取PageBar <br>
     *
     * @return the page bar
     */
    public DalPage.PageBar getPageBar() {
        return new DalPage.PageBar();
    }


    /**
     * 为了页面相关的内容设置PageBar <br>
     */
    public class PageBar {
        private static final int BLOCK_LENGTH = 5;
        private List<Integer> clickBlocks;
        private int start;
        private int end;

        /**
         * 默认构造函数 <br>
         */
        PageBar() {
            if (DalPage.this.pages == 0) {
                this.clickBlocks = Collections.emptyList();
            }

            this.start = DalPage.this.currentPage - 2 < 1 ? 1 : DalPage.this.currentPage - 2;
            this.end = this.start + 5 - 1;
            if (this.end > DalPage.this.pages) {
                this.end = DalPage.this.pages;
                this.start = this.end - 5 + 1;
            }

            if (this.start < 1) {
                this.start = 1;
            }

            this.clickBlocks = new LinkedList();

            for (int i = this.start; i <= this.end; ++i) {
                this.clickBlocks.add(i);
            }

        }

        /**
         * 获取点击块 <br>
         *
         * @return the click blocks
         */
        public List<Integer> getClickBlocks() {
            return this.clickBlocks;
        }

        /**
         * 获取之前的点击块 <br>
         *
         * @return the boolean
         */
        public boolean hasPreviousBar() {
            return DalPage.this.pages > 0 && this.start > 1;
        }

        /**
         * 获取之后的点击块 <br>
         *
         * @return the boolean
         */
        public boolean hasNextBar() {
            return DalPage.this.pages > 0 && this.end < DalPage.this.pages;
        }
    }
}
