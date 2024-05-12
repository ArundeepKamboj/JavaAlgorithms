package org.array;


import java.util.Arrays;

public class Search {
    static int searchInArray(int[] array, int numberToSearch){
        System.out.println("Array recevied as input is : " + Arrays.toString(array));
        for(int i=0; i< array.length; i++){
            if(array[i] == numberToSearch){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
}
