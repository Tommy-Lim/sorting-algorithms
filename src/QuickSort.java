/**
 * Created by Tommy on 4/26/17.
 */

import java.util.*;


public class QuickSort {

    public static int[] QuickSort(int[] input){
        if(input.length <2){
            return input;
        }

        int pivotValue = input[input.length-1];
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        for(int i=0; i<input.length-1; i++){
            if(input[i] < pivotValue){
                left.add(input[i]);
            } else{
                right.add(input[i]);
            }
        }

        int[] leftArr = new int[left.size()];
        int[] rightArr = new int[right.size()];

        for(int i=0; i<left.size(); i++){
            leftArr[i] = left.get(i);
        }

        for(int i=0; i<right.size(); i++){
            rightArr[i] = right.get(i);
        }
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Left: " + Arrays.toString(leftArr));
        System.out.println("Right: " + Arrays.toString(rightArr));
        System.out.println("");

        int[] leftResult = QuickSort(leftArr);
        int[] rightResult = QuickSort(rightArr);

//        System.out.println("LeftResult: " + Arrays.toString(leftResult));
//        System.out.println("RightResult: " + Arrays.toString(rightResult));

        int[] result = new int[input.length];

        for(int i=0; i<result.length; i++){
            int j =0;
            if(i < leftResult.length){
                result[i] = leftResult[i];
            } else if(i == leftResult.length){
                result[i] = pivotValue;
            } else{
                result[i] = rightResult[j++];
            }
        }

        return result;

    }

    public static void main(String[] args){
        int[] test1 = {0,4,5,2,4,1,3,5,3,1,0,0,99};
        System.out.println(Arrays.toString(QuickSort(test1)));

//        int[] test2 = {};
//        System.out.println(Arrays.toString(QuickSort(test2)));
//
//        int[] test3 = {0,1,2,3,4,5};
//        System.out.println(Arrays.toString(QuickSort(test3)));
//
//        int[] test4 = {5,4,3,2,1,0};
//        System.out.println(Arrays.toString(QuickSort(test4)));
    }
}
