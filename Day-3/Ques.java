import java.util.*;
public class Ques{
    /*public static int product(int a, int b){
        return a*b;
    }*/

    /*public static int factorial(int num){
        int fact=1;
        for(int i=1; i<=num;i++){
            fact*=i;
        }
        return fact;
    }*/

    public static int overloading(int a, int b){
        return a+b;
    }

    public static float overloading(float a, float b){
        return a+b;
    }

    public static int overloading(char a, char b){
        return a+b;
    }

    public static void main(String args[]){
        /*System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();*/
    
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i; j>1; j--){
                System.out.print(j);
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        } */

        //Diamond pattern
        /*for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*System.out.println(product(5,6));
        System.out.println(factorial(5));*/

        System.out.println(overloading(13f,6f));
        System.out.println(overloading(13,6));
        System.out.println(overloading('a','b'));
        
    }
}

