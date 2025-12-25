public class Ques{
    //QUE:1 CHECK A NUMBER REPEATED IN ARR
    /*public static boolean twiceNum(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }*/

    //QUE:2 BUY AND SELL (FIND MAX. PROFIT)
    /*public static int buyAndsell(int prices[]){
        int buyPrice = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }*/


    //QUE:3 HOW MANY RAIN WATER TRPPED IN THE WALL
    public static int rainTrappedwater(int height[]){
        int n = height.length;
        int res=0, l=0, r=n-1, lMax=height[l], rMax=height[r];

        while(l<r){
            if(lMax <= rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                res+=(lMax-height[l]);
            }else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res+=(rMax-height[r]);
            }
        }
        return res;
    }

    public static void main(String args[]){
        //QUE:1
        /*int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.print(twiceNum(arr));*/

        //QUE:2
        /*int prices[] = {1,2,3};
        System.out.print(buyAndsell(prices));*/

        //QUE:3
        int height[] = {4,2,0,3,2,5};
        System.out.print(rainTrappedwater(height));
    }
}