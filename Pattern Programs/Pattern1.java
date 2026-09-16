import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.println("Heart Pattern");

        // Upper part
        for (int i = n/2; i <= n; i += 2) {

            for (int j = 1; j < n - i; j += 2)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

        // Lower part
        for (int i = n; i >= 1; i--) {

            for (int j = i; j < n; j++)
                System.out.print(" ");

            for (int j = 1; j <= (i * 2) - 1; j++)
                System.out.print("*");

            System.out.println();
        }

        sc.close();
    }
}