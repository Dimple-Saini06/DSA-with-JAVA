public class Backtracking {
    /*public static boolean isSafe(char board[][], int rows, int col){
        for(int i = rows-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        for(int i=rows-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i=rows-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static boolean nQueens(char board[][], int rows){
        if(rows == board.length){
            // printBoard(board);
            // count++;
            return true;
        }

        for(int j=0;j<board.length;j++){
            if(isSafe(board, rows, j)){
                board[rows][j] = 'Q';
                if(nQueens(board, rows+1)){
                    return true;
                }
                board[rows][j] = 'X';
            }
        }
        return false;
    }

    static int count = 0;
    public static void printBoard(char board[][]){
        System.out.println("------------------ chess board ---------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }*/

    public static int gridWay(int i, int j, int n, int m){
        if(i == n-1 && j == m-1){
            return 1;
        }else if(i == n || j == m){
            return 0;
        }

        int w1 = gridWay(i+1, j, n, m);
        int w2 = gridWay(i, j+1, n, m);

        return w1+w2;
    }
    public static void main(String args[]){
        /*int n = 2;
        char board[][] = new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            board[i][j] = 'X';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("solution possible..");
            printBoard(board);
        }else{
            System.out.println("not solution possible..");
        }
        System.out.print("total ways is = " + count);*/

        int n = 2, m = 3;
        System.out.print(gridWay(0,0,n,m));
    }
}