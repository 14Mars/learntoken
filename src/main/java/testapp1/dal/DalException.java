package testapp1.dal;

/**
 * The type Dal exception.
 */
public class DalException extends RuntimeException {
    /**
     * The constant exUnKnowSelect.
     */
    public static final String exUnKnowSelect = "查询，未知的数据访问异常。";
    /**
     * The constant exUnKnowInsert.
     */
    public static final String exUnKnowInsert = "插入，未知的数据访问异常。";
    /**
     * The constant exUnKnowUpdate.
     */
    public static final String exUnKnowUpdate = "更新，未知的数据访问异常。";
    /**
     * The constant exUnKnowDelete.
     */
    public static final String exUnKnowDelete = "删除，未知的数据访问异常。";
    /**
     * The constant exInsertViolateUnique.
     */
    public static final String exInsertViolateUnique = "插入数据违反唯一键约束。";
    /**
     * The constant exUpdateViolateUnique.
     */
    public static final String exUpdateViolateUnique = "更新数据违反唯一键约束。";
    /**
     * The constant exUnKnowSelectOne.
     */
    public static final String exUnKnowSelectOne = "查询单条数据出现异常，未知的数据访问异常。";

    /**
     * Instantiates a new Dal exception.
     *
     * @param message the message
     */
    public DalException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Dal exception.
     *
     * @param message the message
     * @param ex      the ex
     */
    public DalException(String message, Exception ex) {
        super(message, ex);
    }
}
