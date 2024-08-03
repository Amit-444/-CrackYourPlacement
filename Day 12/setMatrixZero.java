// 73. Set Matrix Zeroes

public class setMatrixZero {

    // <-- Bruteforce Approach --> 

    // public void rowCheck(int arr[][], int row, int size) {
    //     for(int i=0; i<size; i++) {
    //         if(arr[row][i] != 0) arr[row][i] = -1;
    //     }
    // }

    // public void colCheck(int arr[][], int col, int size) {
    //     for(int i=0; i<size; i++) {
    //         if(arr[i][col] != 0) arr[i][col] = -1;
    //     }
    // }

    // public void setZeroes(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;

    //     for(int i=0; i<m; i++) {
    //         for(int j=0; j<n; j++) {
    //             if(matrix[i][j] == 0) {
    //                 rowCheck(matrix, i, n);
    //                 colCheck(matrix, j, m);
    //             }
    //         }
    //     }

    //     for(int i=0; i<m; i++) {
    //         for(int j=0; j<n; j++) {
    //             if(matrix[i][j] == -1) matrix[i][j] = 0;
    //         }
    //     }
    // }



    // <-- Better Approach -->
    // TC - O(m * n) ....  SC - O(m + n)

    // public void setZeroes(int[][] matrix) {
    //     int rl = matrix.length;
    //     int cl = matrix[0].length;
    //     int row[] = new int[rl];
    //     int col[] = new int[cl];

    //     for(int i=0; i<rl; i++) {
    //         for(int j=0; j<cl; j++) {
    //             if(matrix[i][j] == 0) {
    //                 row[i] = 1;
    //                 col[j] = 1;
    //             }
    //         }
    //     }

    //     for(int i=0; i<rl; i++) {
    //         for(int j=0; j<cl; j++) {
    //             if(row[i] == 1 || col[j] == 1) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }



    // <-- Optimal Approach -->
    // TC - O(m * n)

    public void setZeroes(int[][] matrix) {
        int rl = matrix.length;
        int cl = matrix[0].length;
        int col0 = -1;

        for(int i=0; i<rl; i++) {
            for(int j=0; j<cl; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if(j == 0) col0 = 0;
                    else matrix[0][j] = 0;
                }
            }
        }

        for(int i=1; i<rl; i++) {
            for(int j=1; j<cl; j++) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0) {
            for(int i=0; i<cl; i++) matrix[0][i] = 0;
        }

        if(col0 == 0) {
            for(int i=0; i<rl; i++) matrix[i][0] = 0;
        }
    }
}
