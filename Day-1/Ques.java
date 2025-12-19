import java.util.*;

public class Ques{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println(sum/3);*/
       

       //leap year or not
       /*System.out.print("Enter the year:");
       int year = sc.nextInt();
       if((year %4 ==0 && year %100 != 0) || (year %400 == 0)){
        System.out.print(year + "is a Leap year");
       }
       else{
        System.out.print(year + "is a Not Leap year");
       }*/

      //factorial of a number
      System.out.print("enter no. : ");
      int num = sc.nextInt();
      /*int fact = 1;
      if(num < 2){
        System.out.print(num);
        return;
      }
      for(int i=num; i>=1;i--){
        fact = fact * i;
      }
      System.out.print(fact);*/

      //table
      for(int i=1;i<=10;i++){
        System.out.println(i*num);
      }

    }
}