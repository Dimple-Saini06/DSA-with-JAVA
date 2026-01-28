public class Suduko {
    public static boolean isSafe(int board[][], int row, int col, int digit){
        for(int cr=0; cr<9; cr++){
            if(board[row][cr] == digit || board[cr][col] == digit){
                return false;
            }
        }

        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr; i<sr+3;i++){
            for(int j = sc; j<sc+3; j++){
                if(board[sr][sc] == digit){
                    return false;
                }
            }
        }

        return true;
    } 

    public static boolean sudukoSolve(int board[][], int row, int col){
        if(row == 9){
            return true;
        }

        int nextRow = row, nextCol = col+1;
        if(nextCol == 9){
            nextRow = row+1;
            nextCol = 0;
        } 

        if(board[row][col] != 0){
            return sudukoSolve(board, nextRow, nextCol);
        }

        for(int digit = 1; digit <= 9; digit++){
            if(isSafe(board, row, col, digit)){
                board[row][col] = digit;
                if(sudukoSolve(board, nextRow, nextCol)){
                    return true;
                }else{
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    public static void print(int board[][]){
        for(int row = 0; row<board.length; row++){
            if(row % 3 == 0 && row != 0){
                System.out.println("-----------------------------------");
            }
            for(int col = 0; col < board[0].length; col++){
                System.out.print(board[row][col] + ",");
            }
            System.out.println();
        } 
    }
        
    
    public static void main(String args[]){
        int board[][] = {{5,3,0,0,7,0,0,0,0},
                         {6,0,0,1,9,5,0,0,0},
                         {0,9,8,0,0,0,0,6,0},
                         {8,0,0,0,6,0,0,0,3},
                         {4,0,0,8,0,3,0,0,1},
                         {7,0,0,0,2,0,0,0,6},
                         {0,6,0,0,0,0,2,8,0},
                         {0,0,0,4,1,9,0,0,5},
                         {0,0,0,0,8,0,0,7,9}
                        };
        
        if(sudukoSolve(board,0,0)){
            System.out.println("Solution Exists..");
            print(board);
        }else {
            System.out.println("Solution doesn't Exists!!");
        }
    }
}