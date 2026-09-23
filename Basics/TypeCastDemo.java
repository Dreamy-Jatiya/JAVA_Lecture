// Widening: smaller data type -> larger data type
// Implicit conversion: done automatically by Java

// Narrowing: larger data type -> smaller data type
// Explicit conversion: requires type casting

// Syntax:
// destinationType variable = (destinationType) sourceVariable;

public class TypeCastDemo {

    public static void main(String[] args) {

        // int -> long: Widening
        int i = 20;
        long l = 9999999999L;

        // long -> int: Narrowing
        i = (int) l;
        System.out.println("l = " + l + " i = " + i);

        // int -> float: Widening
        i = 30;
        float f = 45.6f;

        // float -> int: Narrowing
        i = (int) f;
        System.out.println("f = " + f + " i = " + i);

        // float -> double: Widening
        float f1 = 12.12f;
        double d = f1;
        System.out.println("f1 = " + f1 + " d = " + d);

        // double -> float: Narrowing
        d = 12.123456789;
        f1 = (float) d;
        System.out.println("d = " + d + " f1 = " + f1);

        // char <-> int
        char ch = 'A';
        i = 35;

        // int -> char: Narrowing
        ch = (char) i;
        System.out.println("i = " + i + " ch = " + ch);

        // boolean
        i = 55;
        boolean b = true;
        System.out.println("b = " + b);

        // boolean cannot be converted to numeric types
        // f = (float)b; // ERROR

    }
}