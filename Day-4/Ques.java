import java.util.*;

public class Ques{
    /*public static int[] update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]+1;
        }
       return arr;
    }*/

    //LINEAR SEARCH
    /*public static int linearSearch(int arr[], int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }*/


    //LARGEST NO. IN ARRAY
    /*public static int largestNum(int arr[]){
        int largeNum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < largeNum){
                largeNum = arr[i];
            }
        }
        return largeNum;
    }*/


    //BINARY SEARCH
    /*public static int binSearch(int arr[], int val){
        int start = 0, end = arr.length-1;
        while(end >= start){
            int mid = (start+end)/2;
            if(val == arr[mid]){
                return mid;
            }
            else if(val > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }*/


    //REVERSE AN ARRAY
    /*public static int[] reverseArr(int arr[]){
        int start=0, end=arr.length-1;
        while(start < end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++; end--; 
        }
        return arr;
    }*/

    //PAIRS IN ARRAY
    /*public static int pairArr(int arr[]){
        int pair = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                pair++;
            }
            System.out.println();
        }
        return pair;
    }*/

    //PRINT SUBARRAY
    public static void subArray(int arr[]){
        int sum =0; int add=0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE; 

        for(int i=0;i<arr.length;i++){
            add = 0;
            for(int j=i;j<arr.length;j++){
                for(int k =i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    add += arr[k];
                }
                if(largest < add){
                    largest = add;
                }

                if(smallest > add){
                    smallest = add;
                } 

                System.out.println();
                System.out.print("Total sum of digits of subarrays:" + i + "is : " + add);
                sum++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray:" + sum);
        // System.out.print("Total sum of digits of subarrays:" + add);
        System.out.println("Highest subarrays sum is :" + largest);
        System.out.print("Smallest subarrays sum is :" + smallest);
    }

    public static void main(String args[]){
        int arr[] = {5,2,5};
        /*System.out.println(arr[5]);
        arr[5] = 10;
        System.out.println(arr[5]);*/

        /*update(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
        
        // System.out.print(linearSearch(arr, 9));
        // System.out.print(largestNum(arr));

        // System.out.print(binSearch(arr,1));
        
        /*for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        reverseArr(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }*/
        
        //System.out.print(pairArr(arr));

        subArray(arr);
    }
}