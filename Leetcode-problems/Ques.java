public class Ques{
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int n = matrix.length, m = matrix[0].length;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=m-1;j++){
                matrix[j][n-i-1] = matrix[i][j];
                System.out.println("matrix[" +j+"][" + (n-i-1) + "]" + "=" + matrix[j][n-i-1] + "matrix[" +i+"][" + j + "]" + "=" + matrix[i][j]);
                
            }
            
            System.out.println();
            
        }
System.out.println("matrix print.......");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}