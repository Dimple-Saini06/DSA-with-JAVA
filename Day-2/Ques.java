import java.util.*;

public class Ques {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        /*for(int i=0;i<n;i++){
            for(int j = 0; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }*/

       /*for(int i=0;i<n;i++){
        for(int j=n-i; j>0; j--){
            System.out.print('*');
        }
        System.out.println();
       }*/

      /*char ch = 'A';
      for(int i=1;i<=n;i++){
        for(int j=1; j<=i; j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
      }*/

     /*for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print('*');
        }
        System.out.println();
     }*/

    /*for(int i=0;i<n;i++){
        for(int j=1; j<=n-i;j++){
            System.out.print(j);
        }
        System.out.println();
    }*/

    /*for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print('*');
            for(int k=1; k<=n-1+i; k++){
                System.out.print(' ');
            }  
        }
        System.out.println();
    }*/
    /*int k = 1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i; j++){
            System.out.print(k);
            k++;
        }
        System.out.println();
    }*/

    /*for(int i=1;i<=n;i++){
        for(int j=1; j<=i; j++){
            if((i%2== 0 && j%2 != 0) || (i%2!= 0 && j%2 == 0)){
                System.out.print(0);
            }
            else{
                System.out.print(1);
            }
        }
        System.out.println();
    }*/
        
        /*for(int i=1;i<=n;i++){
            for(int j=i; j<n; j++){
                System.out.print(' ');
            }

            for(int k=1; k<=i; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

       /*System.out.print("Enter rows no. :- ");
       int rows = sc.nextInt();
       System.out.print("Enter columns no. :- ");
       int cols = sc.nextInt();
       for(int i=1; i<=rows; i++){
        for(int j=1; j<=cols; j++){
            if((i!=1 && i!=rows) && (j>1 && j<cols)){
                System.out.print(" ");
            }
            else{
                System.out.print('*');
            }
            
        }
        System.out.println();
       }*/

        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(' ');
            }
            for(int j=1;j<=n;j++){
                if((i!=1 && i!=n) && (j>1 && j<n)){
                    System.out.print(' ');
                }
                else{
                    System.out.print('*');
                }
            }
            System.out.println();
        }*/
       int k=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<n-1-i;j++){
            System.out.print(' ');
        }
        for(int j=0; j<=i+k;j++){
            System.out.print('*');
        }
        k++;
        System.out.println();
       }

       for(int i=n;i>=1;i--){
        for(int j=0;j<n-i;j++){
            System.out.print(' ');
        }
        for(int j=0; j<(2*i-1);j++){
            System.out.print('*');
        }
        
        System.out.println();
       }
    }
}