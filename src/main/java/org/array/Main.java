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

        int index = Search.searchInArray(one_d_array,134);
        System.out.println("Number is present at index : " + index);

        int[] find_two_sum_index = TwoSum.twoSum(one_d_array, 6);
        System.out.println("Target is at indexes : " + Arrays.toString(find_two_sum_index));

        boolean is_unique = UniqueArray.isUnique(continuos_array);
        System.out.println("Array is Unique? " + is_unique);

        Main.singleDimensionArray();
        Main.twoDimensionArray();
    }

    static void singleDimensionArray(){
        SingleDimensionArray sda = new SingleDimensionArray(10);
        System.out.println("Array created is : " + Arrays.toString(sda.arr));
        sda.insert(0,0);
        sda.insert(1,1);
        sda.insert(2,2);
        sda.insert(3,3);
        sda.insert(4,4);
        sda.insert(5,5);
        sda.insert(6,6);
        sda.insert(10,10);
        System.out.println("Array is : " + Arrays.toString(sda.arr));
        sda.traverseArray();

        sda.searchInArray(10);
        sda.searchInArray(4);

        sda.delete(4);
        sda.traverseArray();
    }

    static void twoDimensionArray(){
        TwoDimensionalArray tda = new TwoDimensionalArray(3,3);
        System.out.println("Array created is : " + Arrays.deepToString(tda.arr));

        tda.insert(0,0,0);
        tda.insert(0,1,1);
        tda.insert(0,2,2);
        tda.insert(1,0,3);
        tda.insert(1,1,4);
        tda.insert(1,2,5);
        tda.insert(2,0,6);
        tda.insert(2,1,7);
        tda.insert(2,2,8);
        System.out.println("Array after insertion is : " + Arrays.deepToString(tda.arr));

        tda.accessCell(1,2);
        tda.accessCell(1,3);

        tda.traverse2DArray();

        tda.search(5);
        tda.search(10);

        tda.delete(1,2);
        tda.delete(3,4);
        tda.traverse2DArray();
    }
}
