package org.array;

import java.util.Arrays;

public class MaxProfit {
    static int max_profit(int[] prices){
        System.out.println("Array received as input is : " + Arrays.toString(prices));
        int max_profit =0;
        if(prices.length < 2){
            return max_profit;
        }
        for(int i = 0; i<prices.length; i++){
            for(int j=i+1; j<prices.length;j++){
                if(prices[j] - prices[i] > max_profit){
                    max_profit = prices[j] - prices[i];
                }
            }
        }
        return max_profit;
    }
}
