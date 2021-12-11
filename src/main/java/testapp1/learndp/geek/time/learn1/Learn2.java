package testapp1.learndp.geek.time.learn1;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Learn2 {

    /**
     * 递归求解
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] values = {5, 3, 1};//硬币面值
        int target = 19;//总价

        //初始化了个啥
        ArrayList<Integer> initialCounts = new ArrayList<>(Collections.nCopies(values.length, 0));

        ArrayList<ArrayList<Integer>> coinCombinations = new ArrayList<>();//存储

        //调用方法
        getMinCountsHelper(target, values, initialCounts, coinCombinations);

        int result = getMinNumHelper(coinCombinations);
        System.out.println(result);
    }

    /**
     * 通过递归穷举所有组合
     *
     * @param target
     * @param values
     * @param coinCombinations
     * @return
     */
    private static void getMinCountsHelper(int target, int[] values, ArrayList<Integer> currentCounts, ArrayList<ArrayList<Integer>> coinCombinations) {

        //边界条件，target为0
        if (target == 0) {
            coinCombinations.add(new ArrayList<Integer>(currentCounts));
            return;
        }

        int valueLength = values.length;
        for (int i = 0; i < valueLength; i++) { //遍历所有面值
            int currentValue = values[i];
            if (currentValue > target) { //如果面值大于当前总额，直接跳过
                continue;
            }

            //否则在当前面值组合的对应位置上加1
            ArrayList<Integer> newCounts = new ArrayList<Integer>(currentCounts);
            newCounts.set(i, newCounts.get(i) + 1);
            int rest = target - currentValue;

            //这个地方不是贪心解，因为每次递归都会从最大额度开始都遍历一波
            getMinCountsHelper(rest, values, newCounts, coinCombinations);
        }

    }


    static int getMinNumHelper(ArrayList<ArrayList<Integer>> combinations) {
        //如果没有可用组合返回-1
        if (combinations.size() == 0) {
            return -1;
        }

        int minCount = Integer.MAX_VALUE;
        for (ArrayList<Integer> counts : combinations) {
            int total = 0;//求当前组合
            for (Integer perValueCount : counts) {
                total = total + perValueCount;
            }

            minCount = Math.min(minCount, total);
        }

        return minCount;
    }

}
