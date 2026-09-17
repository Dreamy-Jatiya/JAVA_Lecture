//search element:Linear search
//Sorting Array ele: Bubble Sort
//Author:SRS
import java.util.Scanner;
public class ArrayDemo2A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter arr size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        //allocate ele
        for(int i=0;i<arr.length;i++){
            System.out.print("enter a["+i+"]:");
            arr[i]=sc.nextInt();
        }
        //search ele
        System.out.print("enter ele to search:");
        int ele=sc.nextInt();
        //call search method
        ArrayDemo2A d=new ArrayDemo2A();
        int index=d.searchArr(arr, ele);
        if(index!=-1){
            System.out.println(ele+": found @index:"+index);
        }
        else{
            System.out.println(ele+":not found!");
        }
        //call bubble sort
        arr=d.bubbleSort(arr);
        for (int i : arr) {//for -each loop
            System.out.println(i);
        }
    }//main()
    int searchArr(int[] arr,int n){
        int index=-1;
        //logic: linear search
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                index=i;
            }
        }
        return index;
    }//search()
    int[] bubbleSort(int[] arr){
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
