import java.util.Scanner;
public class Pattern_Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements = ");
        int n=sc.nextInt();
        Pattern_Program lp=new Pattern_Program();         
        lp.ptrn1(n); 
        lp.ptrn2(n); 
        lp.ptrn3(n); 
        lp.ptrn4(n); 
        lp.ptrn5(n); 
        lp.ptrn6(n); 
        lp.ptrn7(n); 
        lp.ptrn8(n); 
        lp.ptrn9(n); 
        lp.ptrn10(n); 
        lp.ptrn11(n); 
        lp.ptrn12("Darshan"); 
        lp.ptrn13(n);

        sc.close();
    }//main 

    //Square Pattern
    void ptrn1(int n){ 
        System.out.println();
        System.out.println("Square:"); 
        for(int i=0;i<n;i++){ 
            for(int j=0;j<n;j++){ 
                System.out.print("*"); 
            } 
            System.out.println(); 
        } 
        System.out.println();
    } 

    //Left Triangle
    void ptrn2(int n){
        System.out.println("Left Triangle");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Left Triangle Reverse
    void ptrn3(int n){
        System.out.println("Left Reverse Triangle");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    //right triangle
    void ptrn4(int n){
        System.out.println("right triangle");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    //right triangle reverse
    void ptrn5(int n){
        System.out.println("right triangle reverse");
            for(int i=0;i<n;i++){
                for(int j=0;j<=i-1;j++){
                    System.out.print(" ");
                }
                for(int k=n-1;k>=i;k--){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
    }

    //Hollow Square
    void ptrn6(int n){
        System.out.println("Hollow Square");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(j==0||j==n-1||i==0||i==n-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
    }

    //Middle Triangle
    void ptrn7(int n){
        System.out.println("middle triangle");
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<=i;k++){
                    System.out.print("* ");
                }       
                System.out.println();
            }
            System.out.println();
    }

    //Diamond
    void ptrn8(int n){
        System.out.println("Diamond");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //rev
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n-1;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }    
        System.out.println();   
    }

    //Hollow Diamond
    void ptrn9(int n){
        System.out.println("Hollow Diamond");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                if(k==n||k==i||k==0||k==n-1)
                    System.out.print("* ");
            else
                System.out.print(" ");
            }
            System.out.println();
        }
        //rev
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n-1;k>=i;k--){
                if(k==i||k==0||k==n-1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    void ptrn10(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }


    void ptrn11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    void ptrn12(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        System.out.println();
    }

    //Hollow Diamond Inside
    void ptrn13(int n){
        System.out.println("Hollow Diamond");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<=i;k++){
                System.out.print("@ ");
            }
            for(int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=n-1;k>i;k--){
                System.out.print("@ ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


