// Voting application: age >= 18 then ask for valid document
// Good example of nested if-else

import java.util.Scanner;
public class VoteDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();

        // Outer if-else: Check whether age is 18 or above
        if (age >= 18) {

            // If age is valid, ask for document verification
            System.out.println("Valid doc? true/false");
            boolean valid = sc.nextBoolean();

            // Nested if-else: Check whether document is valid
            if (valid) {
                System.out.println("You can Vote");
            }
            else {
                System.out.println("Sorry, you can't vote: Invalid doc");
            }
        }
        else {
            // Age is less than 18
            System.out.println("Your age is < 18, can't vote");
        }

        sc.close();
    }
}