/**
 * Created by Tommy on 4/22/17.
 */
public class MergeSort {

    public static int[] merge(int[] a, int[] b){
        // array iterators
        int ai =0;
        int bi =0;

        // total result length
        int totalLength = a.length + b.length;

        // create empty result array
        int[] result = new int[totalLength];

        // add end of a or b or minimum of a and b
        for(int i=0; i<totalLength; i++){
            if(ai>a.length){
                result[i] = b[bi++];
            } else if(bi>b.length){
                result[i] = a[ai++];
            } else if(a[ai] < b[bi]){
                result[i] = a[ai++];
            } else{
                result[i] = a[ai++];
            }
        }

        // return merged array
        return result;
    }

    public static void main(String[] args){
        System.out.println("Test");
    }
}
