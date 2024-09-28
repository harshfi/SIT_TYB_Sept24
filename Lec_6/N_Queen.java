package Lec_6;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int board[][]= new int [n][n];
		
		find(0,board);

	}
	public static void find(int row,int board[][] ) {
		if(row==board.length) {
			print(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			
			if(isSafe(row,col,board)==true) {
				board[row][col]=1;
				find(row+1,board);
				board[row][col]=0;
			}
		}
	}
	public static boolean isSafe(int row,int col,int board[][]) {
		int r=row;
		int c=col;
		//left dia
		while(r>=0 && c>=0) {
			if(board[r][c]==1) return false;
			r--;
			c--;
			
		}
		r=row;
		c=col;
		//right dia
		while(r>=0 && c<board.length) {
			if(board[r][c]==1) return false;
			r--;
			c++;
		}
		//vertical
		r=row;
		c=col;
		while(r>=0) {
			if(board[r][c]==1) return false;
			r--;
		}
		return true;
		
	}
	static void print(int board[][]) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]==1) {
					System.out.print("Q  ");
				}
				else System.out.print("_ ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
