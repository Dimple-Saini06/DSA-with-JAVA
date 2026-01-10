public class Recursion {
    /*public static int tillingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        int vertical = tillingProblem(n-1);
        int horizontal = tillingProblem(n-2);

        return vertical + horizontal;
    }*/

    /*public static String removeDuplicate(String s, int idx, StringBuilder str, int map[]){
        if(idx == s.length()){
            return str.toString();
        }

        char ch = s.charAt(idx);
        if(map[ch - 'a'] == 1){
            removeDuplicate(s, idx+1, str, map);
        }else {
            map[ch-'a'] = 1;
            str.append(ch);
            removeDuplicate(s, idx+1, str, map);
        }

        return removeDuplicate(s, idx+1, str, map);
    }*/

    /*public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }

        int single = friendsPairing(n-1);

        int singlePair = friendsPairing(n-2);

        int pair = (n-1) * singlePair;

        return single + pair; 
    }*/

    /*public static void binaryString(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        binaryString(n-1, 0, str+"0");
        if(lastPlace == 0){
            binaryString(n-1, 1, str+"1");
        }

    }*/
   
    /*public static int printKeyidx(int arr[], int key, int idx){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == key){
            System.out.print(idx + " ");
        }

        return printKeyidx(arr, key, idx+1);
    }*/
    /*static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void convertNumToWord(int n){ 
        if(n == 0){
            return;
        }
        int rem = n % 10;
        convertNumToWord(n/10);
        System.out.print(digits[rem] + " ");
    }*/

    public static int calcLengthOfStr(String s){
        if(s.isEmpty())return 0;

        return calcLengthOfStr(s.substring(1))+1;
    }
    public static void main(String args[]){
        // System.out.print(tillingProblem(4));

        // System.out.print(removeDuplicate("kkkkkuuusshhaall", 0, new StringBuilder(" "), new int[26]));

        // System.out.print(friendsPairing(6));

        // binaryString(4, 0, "");


        /*int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printKeyidx(arr, 12, 0);*/

        // convertNumToWord(1306);
        String s = "dimplekushal";
        System.out.print(calcLengthOfStr(s));
    }
}