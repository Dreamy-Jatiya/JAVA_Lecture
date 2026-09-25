// Matrix Addition

import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter arr size m & n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];

        // Object
        MatrixAdd td = new MatrixAdd();

        // Input values for Matrix A
        System.out.println("Enter value for A");
        a = td.inputValues(a, sc);

        // Input values for Matrix B
        System.out.println("Enter value for B");
        b = td.inputValues(b, sc);

        // Print Matrix A
        System.out.println("Matrix A:");
        td.print2DArr(a);

        // Print Matrix B
        System.out.println("Matrix B:");
        td.print2DArr(b);

        // Matrix Addition
        c = td.matrixAdd(a, b, c);

        // Print Result
        System.out.println("Matrix Addition:");
        td.print2DArr(c);

    }// main()

    // Method to input values into 2D array
    int[][] inputValues(int[][] arr, Scanner sc) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                System.out.print("Enter arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;

    }// inputValues()

    // Method to print 2D array
    void print2DArr(int[][] arr1) {

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[0].length; j++) {

                System.out.print(arr1[i][j] + "\t");
            }

            System.out.println();
        }

    }// print2DArr()

    // Method for matrix addition
    int[][] matrixAdd(int[][] a, int[][] b, int[][] c) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {

                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;

    }// matrixAdd()

}// class