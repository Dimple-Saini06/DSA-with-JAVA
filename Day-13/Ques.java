import java.util.*;
public class Ques{
    /*public static void getIthbit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }*/

    /*public static int setIthbit(int n, int i){
        return n | (1<<i);
    }*/

    /*public static int clearIthbit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }*/

    /*public static int updateIthbit(int n, int i, int newBit){
        n = clearIthbit(n,i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }*/

    /*public static int clearIbit(int n, int i){
        int bitMask = (-1)<<i;
        return n & bitMask;
    }*/

    /*public static int clearBitinRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }*/

    public static boolean powerOfTwo(int n){
        if((n & n-1) == 0 ){
            return true;
        }
        return false;
    }

    /*public static boolean powerOfThree(int n){
        int ans = (n ^ n+1)
        if( ans % 2 != 0){
            return true;
        } 
        return false;
    }*/

    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        /*System.out.println("AND : " + (5&6));
        System.out.println("OR : " + (5|6));
        System.out.println("XOR : " + (5^6));
        System.out.println("1'S COMPLEMENT : " + (~13));
        System.out.println("LEFT SHIFT : " + (5<<5));;
        System.out.println("RIGHT SHIFT : " + (6>>1));*/

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&1) == 1){
            System.out.print("Number is Odd");
        }else{
            System.out.print("Number is Even");
        }*/


        /*getIthbit(6, 1);
        System.out.println(setIthbit(13, 1));
        System.out.println(clearIthbit(10, 1));
        System.out.println(updateIthbit(10, 1,0));*/


        /*System.out.println(clearIbit(15, 2));
        System.out.println(clearBitinRange(6, 1, 2));*/

        // System.out.println(powerOfTwo(19));
        // System.out.println(powerOfThree(19));
        // System.out.println(fastExpo(5, 3));

        // int x=-4;System.out.println(x+" + "+1+" is "+ -~x);
        System.out.println((int)('A'));
    }
}