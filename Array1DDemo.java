//2nd largest element :sort,remove dup ele,cpy ele,2nd largest
public class Array1DDemoA {
    public static void main(String[] args) {
        int[] arr={88,88,44,44,20,22,22};
        //create object(handle)
        Array1DDemoA ad=new Array1DDemoA();
        arr=ad.bsortArr(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i+",");
        }
        ad.rmDupEle(arr);
    }//main
    int[] bsortArr(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }//sort
    void rmDupEle(int[] arr){
        //copy element of an array
        int[] temp=new int[arr.length];
        int j=0,dup=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
            else{
                dup++;
            }
        }
        //for last ele
        temp[j]=arr[arr.length-1];//cpy last ele to temp[]
        System.out.println("New copy array");
        for (int i : temp) {
            System.out.print(i+",");
        }
        System.out.println("dup="+dup);
        //create new unique array
        int[] unq=new int[arr.length-dup];
        //cpyb all ele from temp[] to unq[]
        for(int i=0;i<unq.length;i++){
            unq[i]=temp[i];
        }
        //print ele of unq array
        System.out.println("Unique element array");
        for (int i : unq) {
            System.out.print(i+",");
        }
        System.out.println("2nd largest:"+unq[1]);
    }
}
