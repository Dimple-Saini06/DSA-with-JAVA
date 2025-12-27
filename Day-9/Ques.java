import java.util.*;
public class Ques{
    //QUE:1
    /*public static int search(int arr[] , int target){
        int lo=0, hi=arr.length-1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[lo] <= arr[mid]){
                if(arr[lo]<=target && target <= arr[mid]){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }
            else{
                if(arr[mid] <=target && target <= arr[hi]){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
        }
        return -1;
    }*/


    //QUE:2
    /*public static int largestNum(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        return largest;
    } */


    //QUE:3
    /*public static void spiralMatrix(int matrix[][]){
        int sr = 0, sc=0, er=matrix.length-1, ec=matrix[0].length-1;
        while(sr<=er && sc<=ec){
            for(int i=sc; i<=ec; i++){
                System.out.print(matrix[sr][i] + " ");
            }

            for(int j=sr+1;j<=er;j++){
                System.out.print(matrix[j][ec] + " ");
            }

            for(int i=ec-1;i>=sc;i--){
                if(sr == er){
                    break;
                }
                System.out.print(matrix[er][i] + " ");
            }

            for(int j=er-1;j>=sr+1;j--){
                if(sc == ec){
                    break;
                }
                System.out.print(matrix[j][sc] + " ");
            }

            sr++;sc++;
            er--;ec--;
        }
    }*/


    //QUE:4
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum += matrix[i][j];
                }
            }
        }

        int row = 0;
        for(int col=matrix[0].length-1;col>=0;col--){
            sum += matrix[row][col];
            row++;
        }
        return sum;
    }
    public static void main(String args[]){
        //QUE:1
        /*int arr[] = {6,7,0,1,2,3,4,5};
        System.out.print(search(arr, 0));*/

        //QUE:2
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter Columns : ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("The largest number in the matrix is : " + largestNum(matrix));*/

        //QUE:3
        /*int matrix[][] = {{1,2,3},
                          {5,6,7},
                          {8,9,10}};*/

        /*spiralMatrix(matrix);*/

        //QUE:4
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        System.out.print(diagonalSum(matrix));
    }
}