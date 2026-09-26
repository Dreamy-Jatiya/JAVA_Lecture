// Shift operators
// H.W: a << 5, a >> 8

public class OperatorA3 {
    public static void main(String[] args) {

        int a = 60;

        // display decimal and binary
        System.out.println("a:" + a + "=" + Integer.toBinaryString(a));

        // left shift
        // multiply n*2 without using "*"
        System.out.println("(a<<1):" + (a << 1) + "=" + Integer.toBinaryString(a << 1));
        System.out.println("(a<<2):" + (a << 2) + "=" + Integer.toBinaryString(a << 2));
        System.out.println("(a<<5):" + (a << 5) + "=" + Integer.toBinaryString(a << 5));

        // right shift
        // divide n/2 without using "/"
        System.out.println("(a>>1):" + (a >> 1) + "=" + Integer.toBinaryString(a >> 1));
        System.out.println("(a>>2):" + (a >> 2) + "=" + Integer.toBinaryString(a >> 2));
        System.out.println("(a>>8):" + (a >> 8) + "=" + Integer.toBinaryString(a >> 8));

        // right shift with zero fill
        a = -1;

        System.out.println("(a>>16):" + (a >> 16) + "=" + Integer.toBinaryString(a >> 16));
        System.out.println("(a>>>16):" + (a >>> 16) + "=" + Integer.toBinaryString(a >>> 16));
    }
}