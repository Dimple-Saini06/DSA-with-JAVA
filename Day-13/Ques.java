import java.util.*;
public class Ques{
    public static void main(String args[]){
        /*System.out.println("AND : " + (5&6));
        System.out.println("OR : " + (5|6));
        System.out.println("XOR : " + (5^6));
        System.out.println("1'S COMPLEMENT : " + (~13));
        System.out.println("LEFT SHIFT : " + (5<<5));;
        System.out.println("RIGHT SHIFT : " + (6>>1));*/

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&1) == 1){
            System.out.print("Number is Odd");
        }else{
            System.out.print("Number is Even");
        }
    }
}