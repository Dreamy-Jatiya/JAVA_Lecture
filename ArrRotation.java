public class ArrRotation {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println("original array:");
        for (int i : a) {
            System.out.print(i+",");
        }
        //rotation by 1
        
        int temp=a[0];
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];//{2,3,4,5,_}
        }
        //for last ele
        a[a.length-1]=temp;


        System.out.println();
        System.out.println("rotated array:");
        for (int i : a) {
            System.out.print(i+",");
        }
    }
}
