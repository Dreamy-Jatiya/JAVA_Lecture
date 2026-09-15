// Rectangle Constructor Program

import java.util.Scanner;

class Rect {
    int len;
    int wid;
    boolean isFilled;

    public Rect() {
        len = 6;
        wid = 7;
        isFilled = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 if u want to customize Rect");
        System.out.println("Enter other No. if u want default Rect");

        int temp = sc.nextInt();

        if (temp == 1) {
            setParameter();
        }
    }

    public void setParameter() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Len for Obj 1 = ");
        len = sc.nextInt();

        System.out.println("Enter Wid for Obj 2 = ");
        wid = sc.nextInt();

        System.out.println("Enter 1) Filled Rect");
        System.out.println("Enter 2) Hollow Rect");

        int tempisfilled = sc.nextInt();

        if (tempisfilled == 1) {
            isFilled = true;
        } else {
            isFilled = false;
        }
    }

    public void print() {
        for (int i = 0; i < wid; i++) {
            for (int j = 0; j < len; j++) {
                if (i == 0 || j == 0 || j == len - 1
                        || i == wid - 1 || isFilled) {

                    System.out.print("* ");
                } else {

                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

public class RectangleConstructor {
    public static void main(String[] args) {

        Rect obj1 = new Rect();
        obj1.print();

        Rect obj2 = new Rect();
        obj2.print();
    }
}