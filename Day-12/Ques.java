import java.util.*;
public class Ques{
    /*public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        int i = 1;
        while(i <str.length()){
            if(str.charAt(i-1) == ' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
                i++;
            }
            else{
                sb.append(str.charAt(i));
                i++;
            }
        }
        return sb.toString();

    }*/


    /*public static String compression(String s){
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(i+1 < s.length() && ch == s.charAt(i+1)){
                count++;
            }
            else if(count > 1){
                sb.append(ch);
                sb.append(count);
                count = 1;
            }else{
                sb.append(s.charAt(i));
                count = 1;
            }
            
            
        }
        return sb.toString();
    }*/


    /*public static int countLowerVowel(String s){
        int count =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }*/


    public static boolean anaGram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char sort1[] = s1.toCharArray();
        char sort2[] = s2.toCharArray();

        Arrays.sort(sort1);
        Arrays.sort(sort2);
        /* for(int i=0;i<sort1.length;i++){
            if(sort1[i] != sort2[i]){
                return false;
            }
        }
        return true;*/

        return Arrays.equals(sort1, sort2);
    }
    public static void main(String args[]){
        /*String str = "hii i am dimple";
        System.out.print(toUppercase(str));*/

        /*String s = "aaabbcccdd";
        System.out.print(compression(s));*/

        /*String str="ShradhaDidi";
        String str1="ApnaCollege";
        String str2="ShradhaDidi";
        System.out.println(str.equals(str1) +" "+str.equals(str2));*/

        /*String str="ApnaCollege".replace("l","");
        System.out.println(str);*/

        /*String s1 = "race"; 
        String s2 = new String ("race"); 
        System.out.println(s1.equals(s2));*/

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.print(countLowerVowel(s));*/

        String s1 = "race";
        String s2 = "caare";
        System.out.print(anaGram(s1, s2));
    }
}