public class Recursion{
    /*public static void printIncreValue(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        printIncreValue(n-1);
        System.out.print(n + " ");
    }*/

    /*public static int findFactorial(int n){
        int fact = 1;
        if(n == 0){
            return 1;
        }
        
        fact = n * findFactorial(n-1);;
        return fact;
    }*/

    /*public static int sumOfNatural(int n){
        if(n == 1){
            return 1;
        }
        int prevSum = sumOfNatural(n-1);
        int sum = n + prevSum;
        return sum;
    }*/

    /*public static int fibonacciSeries(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fnm1 = fibonacciSeries(n-1);
        int fnm2 = fibonacciSeries(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }*/

    /*public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }*/
   
    /*public static int firstOccurIdx(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurIdx(arr, key, i+1);
    }*/

    /*public static int lastOccurIdx(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurIdx(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }*/

    public static int calcPow(int x, int n){
        if(n == 0){
            return 1;
        }

        int power = x * calcPow(x, n-1);
        return power;
    }

    public static int optimizePow(int x, int n){
        if(n == 0){
            return 1; 
        }

        int halfPower = optimizePow(x, n/2);
        int halfPowerSqu = halfPower * halfPower;

        if(n%2 != 0){
            halfPowerSqu = x * halfPowerSqu;
        }

        return halfPowerSqu;
    }
    public static void main(String args[]){
        // printIncreValue(10);
        // System.out.print(findFactorial(0));
        // System.out.print(sumOfNatural(10));
        // System.out.print(fibonacciSeries(7));
        /*int arr[] = {1,2,13,4,5};
        System.out.print(isSorted(arr , 0));*/

        /*int arr[] = {1,2,3,4,3,5,13};
        System.out.println(firstOccurIdx(arr, 3, 0));
        System.out.println(lastOccurIdx(arr, 3, 0));*/

        System.out.println(calcPow(2,10));
        System.out.println(optimizePow(2,10));
    }
}