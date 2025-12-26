import java.util.*;
public class Sorting{
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[]){
        int range = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            range = Math.max(range, arr[i]);
        }

        int count[] = new int[range+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        // Integer arr[] = {5, 4, 3, 1, 2};
        selectionSort(arr);
        insertionSort(arr);
        // Arrays.sort(arr, Collections.reverseOrder());

        countingSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}