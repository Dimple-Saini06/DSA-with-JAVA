public class Que {
    public static void reverse(int arr[]){
        int n = arr.length,k=0;
        int temp[] = new int[arr.length];
        for(int i=0; i<n; i++){
            temp[k++] = arr[n-1-i];
        }
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i] + " ");
        }
        
    }

    
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4};
        reverse(arr);
       
    }
}