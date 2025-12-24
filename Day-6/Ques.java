import java.util.*;

public class Ques{
    //TRAPPED RAINWATER
    /*public static int trappedRainwater(int height[]){
        int ax1[] = new int[height.length];
        int ax2[] = new int[height.length];
        
        ax1[0] = height[0];
        for(int i=1;i<height.length;i++){
            ax1[i] = Math.max(ax1[i-1], height[i]);
        }

        ax2[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            ax2[i]= Math.max(height[i], ax2[i+1]);
        }

        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
            int waterlevel = Math.min(ax1[i], ax2[i]);
            trappedWater += (waterlevel-height[i]);
        }

        return trappedWater;
    }*/

    public static int buyAndsell(int price[]){
        int buyPrice = Integer.MAX_VALUE, maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(buyPrice < price[i]){
                int profit = (price[i] - buyPrice);
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];
            }    
        }
        
        return maxProfit;
    }
    public static void main(String args[]){
        /*int height[] = {4,2,0,6,3,2,5};
        System.out.println("The trapped water is: " + trappedRainwater(height));*/

        int price[] = {7,1,5,3,6,4};
        System.out.print(buyAndsell(price));
    }
}