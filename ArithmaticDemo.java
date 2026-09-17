import java.util.Scanner;
public class ArithmaticDemoA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter i & j:");
        int i=sc.nextInt();
        int j=sc.nextInt();
        //operator overloading '+'
        // System.out.println("i+j:"+i+j);//concat
        System.out.println("(i+j):"+(i+j));
        System.out.println("i-j:"+(i-j));
        System.out.println("i*j:"+(i*j));
        System.out.println("i/j:"+(i/j));
        System.out.println("i%j:"+(i%j));
        //WAP to find vowel/consonent form given char

    }
}
