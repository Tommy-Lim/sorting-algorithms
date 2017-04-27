/**
 * Created by Tommy on 4/26/17.
 */

import java.util.*;


public class QuickSort {

    public static int[] QuickSort(int[] input){
        // base case return single (sorted) or empty array
        if(input.length <2){
            return input;
        }

        // save pivot value
        int pivotValue = input[input.length-1];

        // create unknown length array lists for left and right partitions
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        // add to left or right dependent on lower or higher than pivot, respectively
        for(int i=0; i<input.length-1; i++){
            if(input[i] < pivotValue){
                left.add(input[i]);
            } else{
                right.add(input[i]);
            }
        }

        // convert from array lists to int arrays
        int[] leftArr = new int[left.size()];
        int[] rightArr = new int[right.size()];

        for(int i=0; i<left.size(); i++){
            leftArr[i] = left.get(i);
        }

        for(int i=0; i<right.size(); i++){
            rightArr[i] = right.get(i);
        }

        // recursively partition and sort
        int[] leftResult = QuickSort(leftArr);
        int[] rightResult = QuickSort(rightArr);

        // build final sorted array
        int[] result = new int[input.length];

        // init result array iterator
        int resultIter = 0;

        // add left (lower) side
        for(int i=0; i<leftResult.length; i++){
            result[resultIter] = leftResult[i];
            resultIter++;
        }

        // add pivot value
        result[resultIter] = pivotValue;
        resultIter++;

        // add right (higher) side
        for(int i=0; i<rightResult.length; i++){
            result[resultIter] = rightResult[i];
            resultIter++;
        }

        // return sorted array
        return result;

    }

    public static void main(String[] args){
        int[] test1 = {0,4,5,2,4,1,3,5,3,1,0,0,99};
        System.out.println(Arrays.toString(QuickSort(test1)));

        int[] test2 = {};
        System.out.println(Arrays.toString(QuickSort(test2)));

        int[] test3 = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(QuickSort(test3)));

        int[] test4 = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(QuickSort(test4)));
    }
}
