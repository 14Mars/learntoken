package testapp1.learndp.geek.time.learn1;


/**
 * 贪心算法选硬币
 */
public class Learn1 {

    public static void main(String[] args) {
        int[] values = {5, 3,1};//硬币面值
        int target = 11;//总价
        int result = calcMinCount2(values, target);
        System.out.println(result);
    }

    /**
     * values 已经按大小排序，从大到小
     *
     * @param values
     * @param target
     * @return
     */
    private static int calcMinCount(int[] values, int target) {
        int rest = target;
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            int currentCount = rest / values[i];
            rest = rest - currentCount * values[i];
            count = count + currentCount;

            if (rest == 0) {
                return count;
            }
        }
        return -1;

    }

    private static int calcMinCount2(int[] values, int target) {

        int rest = target; //剩余
        int count = 0;  //总count

        for (int i = 0; i < values.length; i++) {
            int countThisValue = rest / values[i];
            rest = rest - countThisValue * values[i];
            count = count + countThisValue;

            if (rest == 0) {
                return count;
            }
        }

        return -1;
    }






}
