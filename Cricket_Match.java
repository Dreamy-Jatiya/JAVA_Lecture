//Simple Cricket Match Program

import java.util.Scanner;

public class Cricket_Match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Types of Matches");
        System.out.println("1) T20");
        System.out.println("2) ODI");
        System.out.println("3) IPL");

        System.out.print("Enter Type of Match = ");
        int ma = sc.nextInt();

        int overs = 0;

        if (ma == 1 || ma == 3) {
            overs = 20;
        } 
        else if (ma == 2) {
            overs = 50;
        } 
        else {
            System.out.println("Invalid Match Type!");
            sc.close();
            return;
        }

        sc.nextLine();

        System.out.print("Enter Batting Team Name => ");
        String n = sc.nextLine();

        System.out.println("Batting Team: " + n);
        System.out.println("Total Overs: " + overs);

        sc.close();
    }
}