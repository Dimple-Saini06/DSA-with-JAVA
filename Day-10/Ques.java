import java.util.*;
public class Ques{
    //QUES:1
    /*public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];

            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }*/


    //QUES:2
    /*public static boolean searchInmatrix(int matrix[][], int target){
        int i=0, j=matrix[0].length-1;
        while(i<matrix.length && j<matrix[0].length){
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] < target){
               i++;
            }
            else{
                j--;
            }
        }

        return false;
    }*/

    /*public static int[][] transposedMatrix(int matrix[][]){
        int transMatrix[][] = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transMatrix[j][i] = matrix[i][j];
            }
        }
        return transMatrix;
    }*/

    //QUES:4
    /*public static boolean isPalidrome(String s){
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }*/

    //QUES:5
    public static boolean anagram(String s1, String s2){
        int count1[] = new int[26];
        int count2[] = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            int idx = ch - 'a';
            count1[idx]++;
        }

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            int idx = ch-'a';
            count2[idx]++;
        }

        return Arrays.equals(count1,count2);
    }
    public static void main(String args[]){
        //QUES:1
        /*int matrix[][] = {{1,2,3},
                          {5,6,7},
                          {8,9,10}};*/

        //System.out.print(diagonalSum(matrix));

        //QUES:2
        /*int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        
        System.out.print(searchInmatrix(matrix, 1));*/

        //QUES:3
        /*int matrix[][] = {{1,2,3},{4,5,6}};
        int transMatrix[][] = transposedMatrix(matrix);
        for(int i=0;i<transMatrix.length;i++){
            for(int j=0;j<transMatrix[0].length;j++){
                System.out.print(transMatrix[i][j] + " ");
            }
            System.out.println();
        }*/

        //QUES:4
        /*String s = "raar";
        System.out.print(isPalidrome(s));*/

        //QUES:5
        System.out.print(anagram("dimp", "pldeim"));

    }
}