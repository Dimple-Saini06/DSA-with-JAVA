public class Backtracking {
    public static void permutation(int arr[], int idx){
        if(idx == arr.length){
            print(arr);
            return;
        }

        for(int j=idx;j<arr.length;j++){
            swap(arr, idx, j);
            permutation(arr,idx+1);
            swap(arr,idx,j);
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        permutation(arr,0);
    }
}