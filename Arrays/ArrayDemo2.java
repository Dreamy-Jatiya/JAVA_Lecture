// Search element: Linear Search
// Sorting array elements: Bubble Sort


import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter arr size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Take array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        // Take element to search
        System.out.print("Enter ele to search: ");
        int ele = sc.nextInt();

        // Create object
        ArrayDemo2 d = new ArrayDemo2();

        // Call linear search method
        int index = d.searchArr(arr, ele);

        if (index != -1) {
            System.out.println(ele + ": found @index: " + index);
        } else {
            System.out.println(ele + ": not found!");
        }

        // Call bubble sort method
        arr = d.bubbleSort(arr);

        System.out.println("Sorted array:");

        // Display sorted array
        for (int i : arr) {
            System.out.println(i);
        }

        sc.close();

    }// main()

    // Linear Search
    int searchArr(int[] arr, int n) {

        int index = -1;

        // Check each element one by one
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n) {
                index = i;
                break;
            }
        }

        return index;

    }// search()

    // Bubble Sort
    int[] bubbleSort(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}