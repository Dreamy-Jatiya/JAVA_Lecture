// Find Largest Element in 1D Array

public class LargeDemoArr {

    // Find largest element
    int Lrg(int[] a){

        // Assume first element is largest
        int l=a[0];

        // Compare all array elements
        for(int i=0;i<a.length;i++){

            if(a[i]>l){
                l=a[i];
            }
        }

        return l;

    }//Lrg

}