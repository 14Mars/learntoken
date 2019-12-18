package testapp1.dal;

/**
 * The type Reflect operation exception.
 */
public class ReflectOperationException extends RuntimeException {
    /**
     * The constant exClassNotFound.
     */
    public static final String exClassNotFound = "类没有找到。";
    /**
     * The constant exMethodNotFound.
     */
    public static final String exMethodNotFound = "方法没有找到。";
    /**
     * The constant exFieldNotFound.
     */
    public static final String exFieldNotFound = "字段没有找到。";
    /**
     * The constant exMethodInvoke.
     */
    public static final String exMethodInvoke = "方法执行异常。";
    /**
     * The constant exIllegalAccess.
     */
    public static final String exIllegalAccess = "非法的访问。";
    /**
     * The constant exInstantiation.
     */
    public static final String exInstantiation = "初始化实例异常。";
    /**
     * The constant exUnSupport.
     */
    public static final String exUnSupport = "不支持的类型转换。";
    /**
     * The constant exDateParse.
     */
    public static final String exDateParse = "日期格式错误。";

    /**
     * Instantiates a new Reflect operation exception.
     *
     * @param message the message
     */
    public ReflectOperationException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Reflect operation exception.
     *
     * @param message the message
     * @param ex      the ex
     */
    public ReflectOperationException(String message, Exception ex) {
        super(message, ex);
    }
}
