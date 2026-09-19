public class BitwiseDemo {
    public static void main(String[] args) {
        int a=60,b=13;
        System.out.println(a+"="+Integer.toBinaryString(a));
        System.out.println(b+"="+Integer.toBinaryString(b));
        System.out.println("AND:"+(a&b)+"="+Integer.toBinaryString(a&b));
        System.out.println("OR:"+(a|b)+"="+Integer.toBinaryString(a|b));
        System.out.println("~a:"+(~a)+"="+Integer.toBinaryString(~a));
        
    }
}
