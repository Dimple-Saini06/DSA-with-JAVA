import java.util.*;
public class Ques{
    public static void getIthbit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }

    public static int setIthbit(int n, int i){
        return n | (1<<i);
    }

    public static int clearIthbit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthbit(int n, int i, int newBit){
        n = clearIthbit(n,i);
        int bitMask = newBit<<i;
        return n | bitMask;
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


        getIthbit(6, 1);
        System.out.println(setIthbit(13, 1));
        System.out.println(clearIthbit(10, 1));
        System.out.println(updateIthbit(10, 1,0));
    }
}