package org.array;

import java.util.Arrays;

public class BestScore {

    static int[] findTopTwoScores(int[] array){
        System.out.println("Array received as input is : " + Arrays.toString(array));
        int[] bestscore = new int[2];
        if(array.length > 2){
            int first =Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            for(int number: array){
                if(number> second){
                    if(number > first){
                        second = first;
                        first = number;
                    } else{
                        second = number;
                    }
                }
            }
            bestscore[0] = first;
            bestscore[1] = second;
        }
        return  bestscore;
    }
}
