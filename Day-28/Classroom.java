import java.util.*;

public class Classroom {
    // static void swapVal(ArrayList<Integer> list, int i, int j){
    //     int temp = list.get(i); //12
    //     list.set(i, list.get(j));
    //     list.set(j, temp);

    //     // System.out.print("fun : " + list.get(i));
    // }


    /*static int containWater(ArrayList<Integer> heights){
        int left=0, right=heights.size()-1, maxWater = Integer.MIN_VALUE;

        while(left < right){
            int minHeight = Math.min(heights.get(left), heights.get(right));
            int width  = right-left;
            int currWater = minHeight * width;
            maxWater = Math.max(currWater, maxWater);

            if(heights.get(left) < heights.get(right)){
                left++;
            }else{
                right--;
            }        
        }

        return maxWater;
    }*/

    /*static ArrayList<Integer> pairSum(ArrayList<Integer> arr, int target){
        int l=0, r =arr.size()-1;
        ArrayList<Integer> newArr = new ArrayList<>(Arrays.asList(-1));
        while(l<r){
            if((arr.get(l)+arr.get(r))==target){
                newArr.remove(0);
                newArr.add(l);
                newArr.add(r);
                return newArr;
            }else if((arr.get(l)+arr.get(r)) < target){
                l++;
            }else{
                r--;
            }
        }
        return newArr;
    }*/

    /*static boolean pairSum(ArrayList<Integer> arr, int target){
        int l=0, r = l+1, pivot = 0, n=arr.size();
        while(r<n){
            if(!(arr.get(l) < arr.get(r))){
                l = l+1;
                r = r-1;
                break;
            }else{
                l++;
                r++;
            }
        }

        while(l != r){
            if((arr.get(l) + arr.get(r)) == target){
                return true;
            }else if((arr.get(l)+arr.get(r))<target){
                l = (l+1)%n;
            }else{
                r = (n+r-1)%n;
            }
        }
        return false;
    }*/

    public static ArrayList<Integer> lonelyNum(ArrayList<Integer> arr){
        Collections.sort(arr);
        ArrayList<Integer> num = new ArrayList<>();

        for(int i = 1;i<arr.size()-1;i++){
            if(arr.get(i-1)+1 < arr.get(i) && arr.get(i)+1 < arr.get(i+1)){
                num.add(arr.get(i));
            }
        }

        if(arr.size() == 1){
            num.add(arr.get(0));
        }

        if(arr.size() > 1){
            if(arr.get(0)+1 < arr.get(1)){
                num.add(arr.get(0));
            }
            if(arr.get(arr.size()-1) > arr.get(arr.size()-2 )+1){  //for check duplicates
                num.add(arr.get(arr.size()-1));
            }
        }
        

        return num;
    }
    public static void main(String args[]){
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(1);
        // list.add(12);
        // list.add(3);
        // list.add(4);

        // System.out.println(list);  
        // System.out.println(list.get(1));  
        // System.out.println(list.remove(1)); 
        // System.out.println(list.contains(14));
        // list.set(3, 10);

        // int maximum = Integer.MIN_VALUE;
        // for(int i=list.size()-1; i>=0; i--){
        //     if(maximum < list.get(i)){
        //         maximum = list.get(i);
        //     }   
        // }
        // swapVal(list, 1,3);
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list); 


        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        // ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        // ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(3,6,9,12,15));
        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);

        // System.out.print(mainList);

        // ArrayList<Integer> heights = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        // System.out.print(containWater(heights));

        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        // System.out.print(pairSum(arr,22));
        
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(11,15,6,7,8,9));
        // System.out.print(pairSum(arr,99));

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,6,5,8));
        System.out.print(lonelyNum(arr));
        
    }
}