package testapp1.learndp.geek.time.learn1;


/**
 * 贪心算法选硬币
 */
public class Learn1 {

//    public static void main(String[] args) {
//
//        System.out.println(Integer.MAX_VALUE+9);
//
//
////        int[] values = {5, 3, 1};//硬币面值
////        int target = 11;//总价
//////        int result = calcMinCount2(values, target);
////        int result = getMinCoinCountLoop(target, values, 0);
////        System.out.println(result);
////
////        int result2 = (result == Integer.MAX_VALUE) ? -1 : result;
////        System.out.println(result2);
//
//    }


    /**
     * values 已经按大小排序，从大到小
     * 贪心法，每次取最大的数。直到不能取
     *
     * @param values
     * @param target
     * @return
     */
    private static int calcMinCount(int[] values, int target) {
        int rest = target;
        int count = 0;

        //小于length，数组的length是max下标+1
        for (int i = 0; i < values.length; i++) {
            //能取多少个value[i]
            int currentCount = rest / values[i];
            //减去乘积，剩下的target
            rest = rest - currentCount * values[i];
            //维护此次的count
            count = count + currentCount;

            //结束状态
            if (rest == 0) {
                return count;
            }
        }
        return -1;

    }

    /**
     * 写第二遍
     *
     * @param values
     * @param target
     * @return
     */
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


    public static void main(String[] args) {

        int[] values = {5, 4};//硬币面值
        int target = 11;//总价
//        int result = calcMinCount2(values, target);
        int result = getMinCoinCountOfValue(target, values, 0);
        System.out.println(result);
        System.out.println(Math.min(Integer.MAX_VALUE+3,2));

//        int result2 = (result == Integer.MAX_VALUE) ? -1 : result;
//        System.out.println(result2);

    }

    /**
     * 加入回溯的考虑
     * 这个回溯的swap没看懂
     *
     * @param target
     * @param values
     * @param k 是数组下标
     * @return
     */
    private static int getMinCoinCountLoop(int target, int[] values, int k) {
        //处理结果，先初始化为max
        int minCount = Integer.MAX_VALUE;

        int valueCount = values.length;

        //基准情况，k是数组下标，已经到结束为止
        if (k == valueCount) {
            return Math.min(minCount, getMinCoinCountOfValue(target, values, 0));
        }

        for (int i = k; i <= valueCount - 1; i++) {
            //这是个swap
            int t = values[k];
            values[k] = values[i];
            values[i] = t;

            minCount = Math.min(minCount, getMinCoinCountLoop(target,values,k+1));

            //回溯
            t = values[k];
            values[k] = values[i];
            values[i] = t;


        }

        return 0;
    }

    /**
     * @param target
     * @param values
     * @param valueIndex 当前这个面值的下标
     * @return
     */
    static int getMinCoinCountOfValue(int target, int[] values, int valueIndex) {
        int valueSize = values.length;

        //不应出现，属于开区间的边界值
        //数组最后一个index是length-1
        if (valueIndex == valueSize) {
            return Integer.MAX_VALUE;
        }

        //最终的结果，先初始化为max
        int minResult = Integer.MAX_VALUE;

        //当前尝试的硬币金额
        //index是当前尝试的面值的数组下标，数组是按从大到小的顺序排列的
        int currentValue = values[valueIndex];

        //最多能放几个当前的value面值
        //回溯的边界值？
        int maxCount = target / currentValue;

        //从maxCount倒序开始
        for (int count = maxCount; count >= 0; count--) {
            int rest = target - count * currentValue;

            //如果rest为0表示可以除尽，退出
            if (rest == 0) {
                minResult = Math.min(minResult, count);
                break;
            }

            //否则尝试用剩余面值,求当前余额的硬币总数。
            //将下标移到后面一位
            //这是个递归调用
            int restCount = getMinCoinCountOfValue(rest, values, valueIndex + 1);

            //为max说明rest的没找到结果
            if (restCount == Integer.MAX_VALUE) {
                //如果count=0，rest又为max。说明是没找到，相当于返回-1
                if (count == 0) {
                    break;
                }
                continue;
            }

            //这个地方不会报错吗 count + restCount，应该越界了吧
            minResult = Math.min(minResult, count + restCount);
        }
        return minResult;
    }

}
