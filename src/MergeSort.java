/**
 * Created by Tommy on 4/22/17.
 */

import java.util.*;

public class MergeSort {

    public static int[] Merge(int[] a, int[] b){
        // array iterators
        int ai =0;
        int bi =0;

        // total result length
        int totalLength = a.length + b.length;

        // create empty result array
        int[] result = new int[totalLength];

        // add end of a or b or minimum of a and b
        for(int i=0; i<totalLength; i++){
            if(ai > a.length - 1){
                result[i] = b[bi++];
            } else if(bi > b.length - 1){
                result[i] = a[ai++];
            } else if(a[ai] < b[bi]){
                result[i] = a[ai++];
            } else{
                result[i] = b[bi++];
            }
        }

        // return merged array
        return result;
    }

    public static int[] MergeSort(int[] input){
        if(input.length < 2){
            return input;
        }
        int middle;
        int[] left;
        int[] right;
        if(input.length%2 == 0){
            middle = input.length/2;
            left = new int[middle];
            right = new int[middle];
        } else{
            middle = (input.length-1)/2;
            left = new int[middle];
            right = new int[middle + 1];
        }
        for(int i=0; i<input.length; i++){
            if(i < middle){
                left[i] = input[i];
            } else{
                right[i-middle] = input[i];
            }
        }
        int[] result = Merge(MergeSort(left), MergeSort(right));
        return result;
    }

    public static void main(String[] args){
        int[] test1 = {0,4,5,2,4,1,3,5,3,1,0,0,99};
        System.out.println(Arrays.toString(MergeSort(test1)));

        int[] test2 = {};
        System.out.println(Arrays.toString(MergeSort(test2)));

        int[] test3 = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(MergeSort(test3)));

        int[] test4 = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(MergeSort(test4)));

    }
}
