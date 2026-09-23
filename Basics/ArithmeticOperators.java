// Arithmetic Operators: +, -, *, /, %

import java.util.Scanner;

public class ArithmeticOperators {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter i & j: ");
        int i = sc.nextInt();
        int j = sc.nextInt();

        // '+' operator with numbers performs addition
        // '+' operator with String performs concatenation
        // System.out.println("i+j:" + i + j); // Concatenation

        System.out.println("(i+j): " + (i + j)); // Addition
        System.out.println("i-j: " + (i - j));   // Subtraction
        System.out.println("i*j: " + (i * j));   // Multiplication
        System.out.println("i/j: " + (i / j));   // Division
        System.out.println("i%j: " + (i % j));   // Modulus

        // WAP to find vowel/consonant from given char

        sc.close();
    }
}