package testapp1.agri4.search;


import java.util.Arrays;

public class SearchFrame {

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 5, 7, 8, 10, 13, 18, 100};

        int result = binarySearch(a,100);

//        print(a);
//
        System.out.println(result);

    }


    /**
     * 这种写法的bug，没有维护好全局的mid index，每次递归之后这个mid index变了
     * @param toSearch
     * @param target
     * @return
     */
    public static int binarySearch(Integer[] toSearch, Integer target) {
        if (toSearch.length == 0) {
            return -1;
        }

        int midIndex = toSearch.length / 2;
        //
        if (target.equals(toSearch[midIndex])) {
            return midIndex;
        }

        if (target < toSearch[midIndex]) {
            Integer[] lowerHalf = Arrays.copyOfRange(toSearch, 0, midIndex);
            return binarySearch(lowerHalf, target);
        }

        if (target > toSearch[midIndex]) {
            Integer[] higherHalf = Arrays.copyOfRange(toSearch, midIndex + 1, toSearch.length);
            return binarySearch(higherHalf, target);
        }

        return -1;

    }


}
