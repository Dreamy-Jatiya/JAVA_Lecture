import java.util.Scanner;

public class BreakDemoA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,a;
        while(true){//for(;;)
            System.out.print("enter num:");
            a=sc.nextInt();
            if(a==-1){
                break;
            }
            sum+=a;
        }//while
        System.out.println("sum="+sum);
    }//main
}
