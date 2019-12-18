package testapp1.dal;

import java.util.ArrayList;
import java.util.List;

/**
 * Sql比较符号相关的Const <br>
 * 〈功能详细描述〉
 *
 * @author 18020760
 * @see [相关类/方法]（可选）
 * @since [产品 /模块版本] （可选）
 */
public class SqlComparatorConsts {
    private static final List<String> ComparatorNoParameterMethods = new ArrayList<>();
    private static final List<String> ComparatorOneParameterMethods = new ArrayList<>();
    private static final List<String> ComparatorTwoParameterMethods = new ArrayList<>();
    private static final List<String> ComparatorListParameterMethods = new ArrayList<>();

    static {
        getComparatorNoParameterMethods().add("IsNull");
        getComparatorNoParameterMethods().add("IsNotNull");
        getComparatorOneParameterMethods().add("EqualTo");
        getComparatorOneParameterMethods().add("NotEqualTo");
        getComparatorOneParameterMethods().add("GreaterThan");
        getComparatorOneParameterMethods().add("GreaterThanOrEqualTo");
        getComparatorOneParameterMethods().add("LessThan");
        getComparatorOneParameterMethods().add("LessThanOrEqualTo");
        getComparatorOneParameterMethods().add("Like");
        getComparatorOneParameterMethods().add("NotLike");
        getComparatorTwoParameterMethods().add("Between");
        getComparatorTwoParameterMethods().add("NotBetween");
        getComparatorListParameterMethods().add("In");
        getComparatorListParameterMethods().add("NotIn");
    }

    /**
     * Gets comparator no parameter methods.
     *
     * @return the comparator no parameter methods
     */
    public static List<String> getComparatorNoParameterMethods() {
        return ComparatorNoParameterMethods;
    }

    /**
     * Gets comparator one parameter methods.
     *
     * @return the comparator one parameter methods
     */
    public static List<String> getComparatorOneParameterMethods() {
        return ComparatorOneParameterMethods;
    }

    /**
     * Gets comparator two parameter methods.
     *
     * @return the comparator two parameter methods
     */
    public static List<String> getComparatorTwoParameterMethods() {
        return ComparatorTwoParameterMethods;
    }

    /**
     * Gets comparator list parameter methods.
     *
     * @return the comparator list parameter methods
     */
    public static List<String> getComparatorListParameterMethods() {
        return ComparatorListParameterMethods;
    }
}
