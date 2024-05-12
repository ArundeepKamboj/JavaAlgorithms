package org.array;

import java.util.Arrays;

public class MissingNumber {
    static int missing_Number(int[] array){
        System.out.println("Array received as input is : " + Arrays.toString(array));
        int total_number= array.length + 1;
        int expected_array_sum = total_number *(total_number+1) / 2;
        int missing_number= expected_array_sum;
        for(int number:array){
            missing_number -= number;
        }
        return missing_number;
    }
}
