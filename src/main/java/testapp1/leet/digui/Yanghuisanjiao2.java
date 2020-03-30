package testapp1.leet.digui;


import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 */
public class Yanghuisanjiao2 {

    public static void main(String[] args) {
        List<List<Integer>> outResult = generate(9);
        for (List<Integer> list : outResult) {
            System.out.println(list);
        }

    }

    public static List<List<Integer>> generate(int numRows) {

        if (numRows == 0){
            return new ArrayList<>();
        }

        if (numRows == 1) {
            List<List<Integer>> outputList = new ArrayList<>();
            List<Integer> resultList = new ArrayList<>();
            resultList.add(1);
            outputList.add(resultList);
            return outputList;
        }

        //!=1 case
        List<Integer> nextLevel = new ArrayList<>();
        List<List<Integer>> outputList = generate(numRows -1);
        List<Integer> currentBotten = outputList.get(numRows - 2);

        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                nextLevel.add(1);
            } else {
                nextLevel.add(currentBotten.get(i-1)+currentBotten.get(i));
            }

        }



        outputList.add(nextLevel);




        return outputList;
    }


//    public static List<List<Integer>> generate(List<List<Integer>> outputList, int numRows) {
//        if (numRows == 1) {
//            List<Integer> resultList = new ArrayList<>();
//            resultList.add(1);
//            outputList.add(resultList);
//            return outputList;
//        }
//
//
//
//        for (int i = 0; i < numRows; i++) {
//            if (i == 0 || i == numRows - 1) {
//                nextLevel.add(1);
//            } else {
//                nextLevel.add(generate(i-1).get(i-1)+generate(i-1).get(i));
//            }
//
//        }
//    }


}
