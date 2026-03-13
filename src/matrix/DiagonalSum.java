package matrix;

public class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int totalSum = 0;  // Initialize the total sum
        // ToDo: Write Your Code Here.
        int n = mat.length;

        // Loop through each row
        for (int i = 0; i < n; i++) {
            totalSum += mat[i][i] + mat[i][n-i-1];
        }

        // If n is odd, subtract the central element
        if (n % 2 != 0) {
            totalSum -= mat[n/2][n/2];
        }
        return totalSum;  // Return the calculated total sum
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int res = DiagonalSum.diagonalSum(A);
        System.out.println(res);


    }
}
