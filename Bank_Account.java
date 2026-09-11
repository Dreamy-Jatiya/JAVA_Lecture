//Write a Java program to implement a BankAccount class with the following data members:acc_no (int)balance (double)pin (private int)
//Provide appropriate setter() and getter() methods.Initially, assign values to acc_no, balance, and pin.Prompt the user to check the
//account balance by entering the account number and PIN.If both the account number and PIN are valid, display the account number and 
//balance; otherwise, print an “Invalid PIN” message.
import java.util.Scanner;

class AccountA{
    int acc_no;
    double balance;
    private int pin;

    void setter(int a,double b,int p)
    {
        acc_no=a;
        balance=b;
        pin=p;
    }

    void getter(int p)
    {
        if(pin==p){
            System.out.println(acc_no+":"+balance);
        }
        else{
            System.out.println("Invalid PIN");
        }
    }
}

public class Bank_Account {
    public static void main(String[] args) {
        AccountA b1=new AccountA();

        Scanner sc=new Scanner(System.in);
        System.out.print("Set PIN -  ");
        b1.setter(4561,200000.54,sc.nextInt());
        System.out.println("Now Value of PIN For Account Is Set");
        System.out.print("Want to Check Balance for B1? Enter PIN= ");
        b1.getter(sc.nextInt());
        System.out.println();
        sc.close();
    }
}
