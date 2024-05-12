package org.array;

public class UniqueArray {
    static boolean isUnique(int[] array){
        for(int i = 0; i<array.length-1; i++){
            for(int j =i+1; j<array.length; j++){
                if(array[i] == array[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
