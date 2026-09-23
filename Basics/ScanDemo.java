// scanf in java: Scanner 
// 1: int,2:float,3:double,4:char,5:Word,6:boolean

import java.util.Scanner;
public class ScanDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //int
        System.out.print("enter no1.& no2:");
        int i=sc.nextInt();        
        int j=sc.nextInt();
        System.out.println("i+j="+(i+j));

        //float
        System.out.print("enter float:");
        float f=sc.nextFloat();

        //double
        System.out.print("enter double:");
        double d=sc.nextDouble();

        //char
        System.out.print("enter char:");
        char ch=sc.next().charAt(0);

        //word
        System.out.print("enter a word:");
        String s=sc.next();

        //boolean
        System.out.print("enter bool:");
        boolean b=sc.nextBoolean();//true/false

        //problem is:\n
        sc.nextLine();//to accept \n solution
        System.out.print("enter a Sentence:");
        String sen=sc.nextLine();

        System.out.println("float f:"+f);
        System.out.println("double d:"+d);
        System.out.println("char ch:"+ch);
        System.out.println("word s:"+s);
        System.out.println("bool b:"+b);
        System.out.println("sen:"+sen);
        sc.close();
    }
}
