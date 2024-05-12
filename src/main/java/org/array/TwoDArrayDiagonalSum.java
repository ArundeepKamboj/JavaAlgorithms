package org.array;

import java.util.Arrays;

public class TwoDArrayDiagonalSum {
    static int diagonal_Sum(int[][] array){
        System.out.println("Input Array received is : " + Arrays.deepToString(array));
        int diagonal_sum = 0, row=0, column=0;
        int number_of_rows = array.length;
        if(number_of_rows==0){
            return diagonal_sum;
        }
        int number_of_columns = array[0].length;
        while(row<number_of_rows && column<number_of_columns){
            diagonal_sum += array[row][column];
            row++;
            column++;
        }
        return diagonal_sum;
    }
}
