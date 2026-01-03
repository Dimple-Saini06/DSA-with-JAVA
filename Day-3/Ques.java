import java.util.*;
public class Ques{
    //function
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

    //overloading
    /*public static int overloading(int a, int b){
        return a+b;
    }

    public static float overloading(float a, float b){
        return a+b;
    }

    public static int overloading(char a, char b){
        return a+b;
    }*/


   //prime nums
    /*public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }*/


   //Binary To Decimal
    public static int binTodec(int num){
        int pow=0, dec=0;
        while(num>0){
            int ld = num%10;
            dec = dec + ld * ((int)Math.pow(2,pow));
            pow++;
            num /=10;
        }

        return dec;
    }

    //Decimal To Binary
    public static int decTobin(int num){
        int pow=0, bin=0;
        while(num>0){
            int ld = num%2;
            bin = bin+ld * ((int) Math.pow(10, pow));
            pow++;
            num /= 2;
        }
        return bin;
    }

    /*public static boolean evenOrodd(int n){
       if(n%2 == 0){
        return true;
       } 
       else {
        return false;
       }
    }

    public static void output(int n){
        if(evenOrodd(n)){
            System.out.print("The number is even.");
        }
        else{
            System.out.print("The number is odd.");
        }
    }*/
    
    /*public static boolean palidrome(int n){
        int pow = 0, val=0;
        int dup = n;
        while(dup>0){
            int ld = dup%10;
            val = val*10+ld;
            pow++; dup /= 10;
        }
        if(n==val){
            return true;
        }
        else{
            return false;
        }
    }*/

    public static int sumOfdigits(int num){
        int sum = 0;
        while(num>0){
            int ld = num%10;
            sum += ld;
            num /= 10;
        }

        return sum;
    }

    public static int getInput(){
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return sumOfdigits(n);
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

        /*System.out.println(overloading(13f,6f));
        System.out.println(overloading(13,6));
        System.out.println(overloading('a','b'));*/

        // System.out.print(isPrime(613));
        System.out.println(binTodec(1100001));
        System.out.print(decTobin(65));
        // output(72);

        // System.out.print(getInput());
    }
}

