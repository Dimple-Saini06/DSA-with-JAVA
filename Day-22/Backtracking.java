public class Backtracking {
    /*public static void recBack(int arr[], int i, int val){
        if(i == arr.length){
            return;
        }
        arr[i] = val;
        recBack(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }*/

    /*public static void findSubset(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        findSubset(str, ans+str.charAt(i), i+1);
        findSubset(str, ans, i+1);
    }*/

    public static void findPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            System.out.println("newS: " + newStr);
            findPermutation(newStr, ans+curr);
        }
        
    }
    public static void main(String args[]){
        // QUE:1
        /*int arr[] = new int[5];
        recBack(arr, 0, 1);
        print(arr);*/

        // findSubset("abcd", "", 0);
        findPermutation("abc", "");
    }
}