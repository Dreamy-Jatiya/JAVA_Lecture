// Array Rotation

public class ArrRotation {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("original array:");

        for (int i : a) {
            System.out.print(i + ",");
        }

        // Rotation by 1 position to left

        // Store first element temporarily
        int temp = a[0];

        // Shift elements one position to left
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1]; // {2,3,4,5,_}
        }

        // Put first element at last position
        a[a.length - 1] = temp;

        System.out.println();

        // Print rotated array
        System.out.println("rotated array:");

        for (int i : a) {
            System.out.print(i + ",");
        }
    }
}