package matrix;

import java.util.Arrays;

public class FindMaxOnesRow {
    public int[] findMaxOnesRow(int[][] mat) {
        int maxOnesIdx = 0;
        int maxOnesCount = 0;
        // ToDo: Write Your Code Here.
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                count += mat[i][j];
            }
            if (count > maxOnesCount) {
                maxOnesCount = count;
                maxOnesIdx = i;
            }
        }
        return new int[]{maxOnesIdx, maxOnesCount};
    }

    public static void main(String[] args) {
        int[][] A = {
                {0, 1},
                {1, 0},
                {1, 1}
        };
        FindMaxOnesRow fdo = new FindMaxOnesRow();
        int[] res = fdo.findMaxOnesRow(A);
        System.out.println(Arrays.toString(res));


    }
}
