// 2D Array in Java

import java.util.Scanner;

public class TwoDimArrA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        

        // Take rows and columns
        System.out.print("enter arr size m & n:");

        int m=sc.nextInt();
        int n=sc.nextInt();

        // Create 2D array
        int[][] arr1=new int[m][n];

        // Create object
        TwoDimArrA td=new TwoDimArrA();

        // Retrieve values
        arr1=td.alVal(arr1,sc);

        // Print 2D Array
        td.print2DArr(arr1);

    }//main()

    // Allocate values
    int[][] alVal(int[][] arr,Scanner sc){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("enter arr["+i+"]["+j+"]:");
                arr[i][j]=sc.nextInt();
            }

        }

        return arr;

    }//meth

    // Print 2D Array
    void print2DArr(int[][] arr1){

        for(int i=0;i<arr1.length;i++)  {
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
            
        }

    }

}//class