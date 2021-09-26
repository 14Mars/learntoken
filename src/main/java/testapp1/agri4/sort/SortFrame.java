package testapp1.agri4.sort;


/**
 * 基本排序框架
 */
public class SortFrame {

    public static void main(String[] args) {
        Integer[] a = {10, 1, 3, 5, 7, 2, 4, 8, 6, 9};

//        compareSort(a);

        insertionSort(a);

        print(a);

        System.out.println(isSorted(a));

    }


    /**
     * 排序操作
     *
     * @param toSort
     */
    public static void sort(Comparable[] toSort) {
        //do the sort
    }

    /**
     * a 是否小于 b
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean isLess(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }


    /**
     * 交换元素
     *
     * @param toSort
     * @param i
     * @param j
     */
    public static void switchElement(Comparable[] toSort, int i, int j) {
        Comparable tmp = toSort[i];
        toSort[i] = toSort[j];
        toSort[j] = tmp;
    }


    /**
     * 打印
     *
     * @param toSort
     */
    public static void print(Comparable[] toSort) {
        for (Comparable element : toSort) {
            System.out.print(element);
            System.out.print(",");
        }
    }


    /**
     * 检查是否排序
     * 此处认为排序为从小到大。
     * 因此只要有 a[i] > a[i+1]就认为未排序
     *
     * @param toCheck
     * @return
     */
    public static boolean isSorted(Comparable[] toCheck) {
        for (int i = 0; i < toCheck.length - 1; i++) {
            if (toCheck[i].compareTo(toCheck[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }


    /***
     * 比较排序,选择排序
     * 每一趟，选出最小的，和该趟一个元素交换
     *
     * @param toSort
     */
    public static void compareSort(Comparable[] toSort) {
        for (int i = 0; i < toSort.length; i++) {
            //初始化第一个为最小
            int minIndex = i;
            for (int j = i + 1; j < toSort.length; j++) {
                if (isLess(toSort[j], toSort[minIndex])) {
                    minIndex = j;
                }
            }
            switchElement(toSort, i, minIndex);
        }
    }


    /**
     * 插入排序
     *
     * @param toSort
     */
    public static void insertionSort(Comparable[] toSort) {
        for (int i = 1; i < toSort.length; i++) {
            for (int j = i; j > 0 && isLess(toSort[j], toSort[j - 1]); j--) {
                switchElement(toSort, j, j - 1);
            }
        }
    }







}
