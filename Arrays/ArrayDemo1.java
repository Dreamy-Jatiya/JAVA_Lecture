// Declaration, Retrieve, Print, Sum, Largest and Smallest element


import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        // Dynamic array declaration
        int arr[] = new int[size];

        // Allocate array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        // Print all array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }

        // Create object
        ArrayDemo1 ad = new ArrayDemo1();

        // Calculate sum
        int sum = ad.sumArr(arr);
        System.out.println("sum = " + sum);

        // Find largest element
        int largest = ad.largeEle(arr);
        System.out.println("largest ele = " + largest);

        sc.close();

    }// main()


    // Calculate sum of array elements
    int sumArr(int[] ar) {
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        return sum;
    }// sum()


    // Find largest element
    int largeEle(int[] arr) {
        int l = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                l = arr[i];
            }
        }

        return l;
    }
}