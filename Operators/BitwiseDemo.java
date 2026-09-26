// Bitwise Operators in Java

public class BitwiseDemo {
    public static void main(String[] args) {

        int a = 60, b = 13;

        // Display decimal and binary representation of a
        System.out.println(a + " = " + Integer.toBinaryString(a));

        // Display decimal and binary representation of b
        System.out.println(b + " = " + Integer.toBinaryString(b));

        // Bitwise AND (&): returns 1 when both bits are 1
        System.out.println("AND: " + (a & b) + " = " + Integer.toBinaryString(a & b));

        // Bitwise OR (|): returns 1 when at least one bit is 1
        System.out.println("OR: " + (a | b) + " = " + Integer.toBinaryString(a | b));

        // Bitwise NOT (~): flips all bits of a
        System.out.println("~a: " + (~a) + " = " + Integer.toBinaryString(~a));
    }
}