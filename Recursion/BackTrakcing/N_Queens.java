public class N_Queens{
    public static void main(String[] args) {
        int row = 8;
        boolean [][]board = new boolean[row][row];
        int ans = func(board, 0);
        System.out.println(ans);
    }

    static int func(boolean[][] board, int row){
        if(row==board.length){
            display (board);
            System.out.println();
            return 1; 
        }

        int count =0;
        //placing the N_Queens and checking for every row and col
        for(int col =0;col<board.length;col++){
            //place the queen if it is possible 
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count +=func(board, row+1);
                board[row][col] = false;
            }
        } 

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        //check diagonal left
        int maxLeft = Math.min(row, col);
        for(int i =1; i<=maxLeft; i++){
            if (board[row-i][col-i]) {
                return false;                
            }
        }

        // check diagonal Right
        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }



        return true;
    }

    private static void display(boolean[][] arr) {
        for(boolean[] row : arr){
            for(boolean element : row){
                if(element){
                    System.out.print("Q");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}


//Recurrence relation T(N) = N*T(N-1) + O(n^2); == O(n^3) + O(n!)
//Space is n sqaure 