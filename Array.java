//Sum,average,multiply,largest,smallest,reverse and sort of array elements

import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Array obj = new Array();
        System.out.print("Enter Array Size = ");
        int size=sc.nextInt();
        int[] arr=new int[size];

        //Taking Array Elements
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter a ["+i+"] : ");
            arr[i]=sc.nextInt();
        }
        //print array
        System.out.println("Array Elements");
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }

        System.out.println("\nSum = " + obj.sumArr(arr));
        System.out.println("Multiply = " + obj.multipyArr(arr));
        System.out.println("Average = " + obj.averageArr(arr));
        System.out.println("Largest = " + obj.largeElement(arr));
        System.out.println("Smallest = " + obj.smallElement(arr));

        System.out.print("Reversed Array ==>  ");
        int[] rev = obj.reverseArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(rev[i] + " ");
        }

        System.out.print("\nSorted Array ==>  ");
        int[] sorted = obj.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(sorted[i] + " ");
        }
        
        sc.close();

    }

    // 1. Sum of array elements
    public int sumArr(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    // 2. Multiply array elements
    public int multipyArr(int[ ] arr){
        int multiply=1;
        for(int i=0;i<arr.length;i++){
            multiply=multiply*arr[i];
        }
        return multiply;
    }

    //3.Reversed Array
    public int[] reverseArr(int[] arr){
    int[] rev = new int[arr.length];
    int j = arr.length - 1;
    for(int i = 0; i < arr.length; i++){
        rev[j--] = arr[i];
    }
    return rev;
}

    // 4. Average of array elements
    public float averageArr(int[ ] arr){
        return (float) sumArr(arr) / arr.length;
    }

    // 5. Largest element
    public int largeElement(int[ ] arr){
        int lar=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar;
    }

    // 6. Smallest element
    public int smallElement(int[ ] arr){
        int sma=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<sma){
                sma=arr[i];
            }
        }
        return sma;
    }

    // 7. Sort array
    public int[ ] sort(int[ ] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}