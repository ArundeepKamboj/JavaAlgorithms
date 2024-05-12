package org.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplictes {

    //O(n) time
    static int[] removeDuplicates(int[] array){
        System.out.println("Array received as input is : " + Arrays.toString(array));
        int[] res;
        Set<Integer> unique_numbers = new HashSet<Integer>();
        for(int number : array){
            unique_numbers.add(number);
        }
        res = new int[unique_numbers.size()];
        int index = 0;
        for(int unique_number:unique_numbers){
            res[index] = unique_number;
            index++;
        }
        return res;
    }

    //O(n square)
    static int[] removeDuplicates_1(int[] array){
        System.out.println("Array received as input is : " + Arrays.toString(array));
        int length = array.length;
        int[] copy_array = new int[length];
        int new_array_index = 0;
        for(int i=0;i<array.length; i++){
            boolean is_duplicate = false;
            for(int j =0; j<new_array_index; j++){
                if(array[i] == copy_array[j]){
                    is_duplicate = true;
                    break;
                }
            }
            if(!is_duplicate){
                copy_array[new_array_index] =array[i];
                new_array_index++;
            }
        }
        int[] res = new int[new_array_index];
        for(int index=0; index<new_array_index; index++){
            res[index] = copy_array[index];
        }
        return res;
    }

    static int distinct_numbers_in_sorted_array(int[] array){
        System.out.println("Array received as input is : " + Arrays.toString(array));
        if (array.length == 0) {
            return 0;
        }
        int prev = Integer.MIN_VALUE;
        int res = 0;
        for(int i =0; i<array.length; i++){
            if(prev != array[i]){
                res++;
                prev = array[i];
            }
        }
        return res;
    }
}
