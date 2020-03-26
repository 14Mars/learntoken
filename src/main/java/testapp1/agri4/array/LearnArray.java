package testapp1.agri4.array;


public class LearnArray {

    public static void main(String[] args) {
        initArray();

        int[] find = {1, 4, 5, 6, 7, 8, 200, 3, 4, 6, 7};


        int[] mean = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(findMax(find));

        System.out.println(calcMean(mean));


    }


    /**
     * 初始化
     */
    public static void initArray() {
        //变量声明
        int[] array1;
        int size = 8;

        //创建
        array1 = new int[size];

        //初始化
        for (int i = 0; i < size; i++) {
            array1[i] = i;
        }


        System.out.println(array1);

    }

    /**
     * 找最大值
     * @param array
     * @return
     */
    public static int findMax(int[] array) {

        int max = -1;

        if (array.length == 0) {
            max = -1;
            return max;
        }

        for (int anArray : array) {
            if (anArray > max) {
                max = anArray;
            }
        }
        return max;
    }


    /**
     * 计算平均值
     * @param array
     * @return
     */
    public static double calcMean(int[] array) {
        double mean = 0.0;
        if (array.length == 0) {
            return mean;
        }

        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];

        }
        return total / array.length;
    }




}
