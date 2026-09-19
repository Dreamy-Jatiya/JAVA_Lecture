import java.util.Scanner;
//declaration,retrive, print, sum,largest & smallest ele

public class ArrayDemoA1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=sc.nextInt();
        //dynamic value
        int arr[]=new int[size]; 
        double[] d=new double[5];
        //allocate arr elements
        for(int i=0;i<arr.length;i++){
            System.out.print("enter a["+i+"]:");
            arr[i]=sc.nextInt();
        }
        //print all array element
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]:"+arr[i]);
        }
        ArrayDemoA1 ad=new ArrayDemoA1();
        int sum=ad.sumArr(arr);
        System.out.println("sum="+sum);
        int largest=ad.largeEle(arr);
        System.out.println("largest ele="+largest);
    }//main()
    int sumArr(int[] ar){
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        return sum;
    }//sum()
    int largeEle(int[] arr){
        int l=arr[0];//20,10,29
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){//29>20
                l=arr[i];
            }
        }
        return l;
    }
}
