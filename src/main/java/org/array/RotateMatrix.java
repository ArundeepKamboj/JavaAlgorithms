package org.array;

import java.util.Arrays;

public class RotateMatrix {
    static boolean rotateMatrix(int[][] matrix){
        if(matrix.length==0 || matrix.length!= matrix[0].length){
            return false;
        }
        int n=matrix.length;
        for(int layer=0; layer<n/2; layer++){
            int first = layer;
            int last =n-layer-1;
            for(int i=first; i<last; i++){
                int offset = i-first;
                int top= matrix[first][i];
                matrix[first][i]=matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        System.out.println("left roatted array is : " + Arrays.deepToString(matrix));
        return true;
    }
}
