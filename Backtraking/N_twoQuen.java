package Backtraking;

public class N_twoQuen {
    public static void nqueen2(char board[][],int row){
      //base
      if(row==board.length){
          print(board);
          return;
      }
      for(int j=0;j<board.length;j++){
        board[row][j]='Q';
        nqueen2(board, row+1);
        board[row][j]='.';//backtracking


      }
    }
    public static void print(char board[][]){
        System.out.println("----------Chess Board---------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';

            }
        }
        nqueen2(board, 0);
    }
}
