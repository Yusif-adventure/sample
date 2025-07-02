package sample;

public class AlgorithmLibrary {


    public int findMaximum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
// Best Case: O(n) because All elements must be checked even if sorted

// Worst Case: O(n) becuase Still need to compare every element

// Average Case: O(n) because it generally checks a significant number of elements in a random array.


    
     public boolean areElementsDistinct(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        for (int j = i + 1; j < array.length; j++) {
            if (array[i] == array[j]) {
                return false;
            }
        }
    }
    return true;
}

// Best Case: O(1) because if the first two elements are distinct, it returns immediately.
// Worst Case: O(n^2) because it checks every pair of elements in the array.
// Average Case: O(n^2) because it generally checks a significant number of pairs in a random array.

//an algorithm that multiplies any n by n matrix


    public int[][] multiplyMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
//Best Case: O(n^3)
// Worst Case: O(n^3)
// Average Case: O(n^3)




    // gaussian elimination algorithm to solve a system of linear equations
    public double[] gaussianElimination(double[][] A) {
    int n = A.length;

    // Forward elimination
    for (int k = 0; k < n; k++) {
        // Partial pivoting
        int maxRow = k;
        for (int i = k + 1; i < n; i++) {
            if (Math.abs(A[i][k]) > Math.abs(A[maxRow][k])) {
                maxRow = i;
            }
        }

        // Swap rows
        double[] temp = A[k];
        A[k] = A[maxRow];
        A[maxRow] = temp;

        // Make all rows below this one 0 in current column
        for (int i = k + 1; i < n; i++) {
            double factor = A[i][k] / A[k][k];
            for (int j = k; j <= n; j++) {
                A[i][j] -= factor * A[k][j];
            }
        }
    }
//Best Case: O(n^3)
// Worst Case: O(n^3)
// Average Case: O(n^3)





    // Back substitution
    double[] x = new double[n];
    for (int i = n - 1; i >= 0; i--) {
        x[i] = A[i][n];
        for (int j = i + 1; j < n; j++) {
            x[i] -= A[i][j] * x[j];
        }
        x[i] /= A[i][i];
    }

    return x;
}

public int countBinaryDigits(int n) {
    if (n == 0) return 1;

    int count = 0;
    while (n > 0) {
        n = n / 2;
        count++;
    }
    return count;
}
// Best Case: O(log n)
// Worst Case: O(log n)
// Average Case: O(log n)



    
  
}

