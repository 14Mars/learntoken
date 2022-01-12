package testapp1.leet.array;

/**
 * Created by bc on 2022/1/1.
 */
public class E2022 {
    public static void main(String[] args) {
        E2022 e2022 = new E2022();
        int[] input = {1,2,3,4,5,6};
        int m = 3;
        int n = 2;

        int[][] result = e2022.construct2DArray(input, m, n);
        for (int[] i : result) {
            StringBuilder sb = new StringBuilder("[");
            for (int j : i) {
                sb.append(j).append(",");
            }
            sb.append("]");
            System.out.println(sb.toString());
        }
    }

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[][]{};
        }

        int[][] result = new int[m][n];

        //m行，n列
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }

        }
        return result;
    }

}
