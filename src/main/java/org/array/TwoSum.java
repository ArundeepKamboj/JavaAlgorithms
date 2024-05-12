package org.array;

public class TwoSum {

    static int[] twoSum(int[] array, int target){
        if(array.length<2){
            return new int[0];
        }
        int[] res = new int[2];
        boolean found = false;
        for(int i = 0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] + array[j] == target){
                    found = true;
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        return res;
    }
}
