package sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AlgorithmLibrary lib = new AlgorithmLibrary();
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number of elements: ");
            int numElements = scanner.nextInt();
            int[] arr = new int[numElements];

            System.out.println("Enter elements:");
            for (int i = 0; i < numElements; i++) {
                arr[i] = scanner.nextInt();
            }

            int max = lib.findMaximum(arr);
            System.out.println("Maximum value in array: " + max);

//            System.out.print("\nDo you want to multiply matrices? (y/n): ");
            System.out.print("\nCheck if all elements are distinct? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'y' || choice == 'Y') {
                boolean distinct = lib.areElementsDistinct(arr);
                if (distinct) {
                    System.out.println("All elements are distinct.");
                } else {
                    System.out.println("Array contains duplicate elements.");
                }
            }

//           System.out.print("\nDo you want to find the maximum value? (y/n): ");
            System.out.print("\nDo you want to multiply two n x n matrices? (y/n): ");
char matrixChoice = scanner.next().charAt(0);
if (matrixChoice == 'y' || matrixChoice == 'Y') {
    System.out.print("Enter size n of the n x n matrices: ");
    int matrixSize = scanner.nextInt();

    int[][] A = new int[matrixSize][matrixSize];
    int[][] B = new int[matrixSize][matrixSize];

    System.out.println("Enter elements of matrix A:");
    for (int i = 0; i < matrixSize; i++)
        for (int j = 0; j < matrixSize; j++)
            A[i][j] = scanner.nextInt();

    System.out.println("Enter elements of matrix B:");
    for (int i = 0; i < matrixSize; i++)
        for (int j = 0; j < matrixSize; j++)
            B[i][j] = scanner.nextInt();

    int[][] result = lib.multiplyMatrices(A, B);

    System.out.println("Resulting matrix (A × B):");
    lib.printMatrix(result);
}

        /// // Gaussian elimination algorithm to solve a system of linear equations
        System.out.print("\nDo you want to solve a system using Gaussian Elimination? (y/n): ");
        char gaussChoice = scanner.next().charAt(0);
        if (gaussChoice == 'y' || gaussChoice == 'Y') {
            System.out.print("Enter number of variables (n): ");
            int n = scanner.nextInt();
            double[][] matrix = new double[n][n + 1];

            System.out.println("Enter the augmented matrix (each row has " + (n + 1) + " values):");
            for (int i = 0; i < n; i++) {
                System.out.println("Row " + (i + 1) + ":");
                for (int j = 0; j <= n; j++) {
                    matrix[i][j] = scanner.nextDouble();
                }
            }

            double[] result = lib.gaussianElimination(matrix);
            System.out.println("Solution:");
            for (int i = 0; i < n; i++) {
                System.out.printf("x%d = %.4f\n", i + 1, result[i]);
            }
        }

        System.out.print("\nDo you want to find the number of binary digits of a number? (y/n): ");
        char binaryChoice = scanner.next().charAt(0);
        if (binaryChoice == 'y' || binaryChoice == 'Y') {
            System.out.print("Enter a positive integer: ");
            int num = scanner.nextInt();
            int bits = lib.countBinaryDigits(num);
            System.out.println("Number of binary digits: " + bits);
        }

    }
}}
