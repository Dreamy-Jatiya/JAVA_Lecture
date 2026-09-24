// 2nd largest element: sort, remove duplicate elements,
// Copy elements and find 2nd largest

public class Array1DDemo {
    public static void main(String[] args) {

        int[] arr = {88, 88, 44, 44, 20, 22, 22};

        // Create object (handle)
        Array1DDemo ad = new Array1DDemo();

        // Sort array in descending order
        arr = ad.bsortArr(arr);

        System.out.println("Sorted array:");

        for (int i : arr) {
            System.out.print(i + ",");
        }

        // Remove duplicate elements
        ad.rmDupEle(arr);

    }// main


    // Sort array in descending order
    int[] bsortArr(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;

    }// sort


    // Remove duplicate elements
    void rmDupEle(int[] arr) {

        // Copy unique elements into temp array
        int[] temp = new int[arr.length];

        int j = 0;
        int dup = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
            else {
                dup++;
            }
        }

        // Copy last element
        temp[j] = arr[arr.length - 1];

        System.out.println("\nNew copy array");

        for (int i : temp) {
            System.out.print(i + ",");
        }

        System.out.println("\ndup = " + dup);

        // Create new array containing only unique elements
        int[] unq = new int[arr.length - dup];

        // Copy elements from temp to unique array
        for (int i = 0; i < unq.length; i++) {
            unq[i] = temp[i];
        }

        // Print unique elements
        System.out.println("\nUnique element array");

        for (int i : unq) {
            System.out.print(i + ",");
        }

        // Since array is sorted in descending order,
        // index 1 contains the 2nd largest element
        System.out.println("\n2nd largest: " + unq[1]);

    }// rmDupEle
}