public class Sorting{
    public static boolean isSorted(int arr[]){
        boolean isAsc = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isAsc = false;
                break;
            }
        }

        boolean isDsc = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                isDsc = false;
                break;
            }
        }

        return isAsc || isDsc;
    } 
    public static void bubbleSort(int arr[]){
        if(isSorted(arr)){
            System.out.println("Array already sorted..");
            return;
        }

        int n = arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void main(String args[]){
        int arr[] = {5, 4, 1, 2, 3};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
}