import java.util.Scanner;

public class CricketAppA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of Over:");
        int over=sc.nextInt();
        int ball=6;
        int total_run=0;
        int[][] run=new int[over][ball];
        for(int i=0;i<over;i++){
            for(int j=0;j<ball;j++){
                System.out.print("enter run["+i+"]["+j+"]:");
                run[i][j]=sc.nextInt();
                total_run+=run[i][j];
            }
        }//loop
        double avg_run=total_run/(double)run.length;
        System.out.println("total run:"+total_run);
        System.out.println("avg run per over:"+avg_run);
    }
}
