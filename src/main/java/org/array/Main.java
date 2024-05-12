package org.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[][] two_d_array={{1,2,3},{4,5,6},{1,2,3},{1,2,3}};
        int[] one_d_array = {1,2,3,542,3253,5,1,35,134,232};
        int[] continuos_array = {1,2,3,4,5,6,7,9,10};
        int[] sorted_array = {1,2,2,3,3,4,4,5,5,5,10,11,13,15,15,171,190,190};
        int[][] two_d_array_1 = {{1,2,3},{4,5,6},{7,8,9}};

        int two_d_array_sum = TwoDArrayDiagonalSum.diagonal_Sum(two_d_array);
        System.out.println("Sum of diagnoals of 2d array is : " + two_d_array_sum);

        int[] bestscores = BestScore.findTopTwoScores(one_d_array);
        System.out.println("Best scores are : " + Arrays.toString(bestscores));

        int max_profit = MaxProfit.max_profit(one_d_array);
        System.out.println("Max profit in prices will be : "+ max_profit);

        int missing_number = MissingNumber.missing_Number(continuos_array);
        System.out.println("Missing number in continuous array is : " + missing_number);

        int[] unique_numbers = RemoveDuplictes.removeDuplicates(one_d_array);
        System.out.println("Array numbers after removing duplicates are : " + Arrays.toString(unique_numbers));
        int[] unique_numbers_1 = RemoveDuplictes.removeDuplicates_1(one_d_array);
        System.out.println("Array numbers after removing duplicates are : " + Arrays.toString(unique_numbers_1));

        int distinct_numbers = RemoveDuplictes.distinct_numbers_in_sorted_array(sorted_array);
        System.out.println("Array numbers after removing duplicates are : " + distinct_numbers);
    }
}
