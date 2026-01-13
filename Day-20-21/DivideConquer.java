public class DivideConquer {
    public static void print(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(String arr[], int si, int ei){ 
        if(si >= ei){
            return;
        }

        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei){
        String temp[] = new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j]) > 0){
                temp[k] = arr[j++];
            } else {
                temp[k] = arr[i++];
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    
    public static void main(String args[]){
        String arr[] = {"sun", "earth", "mars", "queen", "mercury", "smart"};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        print(arr);
    }


    //QUICK SORT
    /*public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int pivot = partition(arr, si, ei);
        quickSort(arr,si,pivot-1);
        quickSort(arr,pivot+1,ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }
    public static void main(String args[]){
        int arr[] = {9,14,7,5,3,6};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        print(arr);
    }*/

}