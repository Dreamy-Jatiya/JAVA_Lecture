// Array of Objects

import java.util.Scanner;

class EmpA {

    int empID;
    double salary;

    // Constructor
    EmpA(int empID, double salary) {
        this.empID = empID;
        this.salary = salary;
    }

    // Display employee details
    void getter() {
        System.out.println(empID + ": salary: " + salary);
    }
}


public class ArrofObj {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of emp: ");
        int size = sc.nextInt();

        // Create array of Employee objects
        EmpA[] e = new EmpA[size];

        // Take employee details
        for (int i = 0; i < e.length; i++) {

            System.out.print("Enter empid & sal: ");

            e[i] = new EmpA(sc.nextInt(), sc.nextDouble());
        }

        // Display employee details
        for (int i = 0; i < e.length; i++) {

            e[i].getter();
        }

        sc.close();
    }
}