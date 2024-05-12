package org.array;

import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] middle_array;
        middle_array = middle(arr);
        System.out.println("Input array is : " + Arrays.toString(arr));
        System.out.println("Middle array is : " + Arrays.toString(middle_array));
    }

    static int[] middle(int[] arr){
        if(arr.length < 2){
            return new int[0];
        }
        int[] middle = new int[arr.length-2];
        for(int i=1; i<arr.length-1; i++){
            middle[i-1] = arr[i];
        }
        return middle;
    }
}
