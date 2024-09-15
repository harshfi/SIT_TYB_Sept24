package Lec_3;

public class Toeplitz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		
      System.out.println(toe(a));
	}
	public static boolean toe(int a[][]) {
		int row=0;
		int col=1;
		
		while(row<a.length) {
			int r=row;
			int c=0;
			int ele=a[row][0];
			//dia traivsersal 
			while(r<a.length && c<a[row].length) {
				if(ele!=a[r][c]) return false;
				r++;
				c++;
			}
			row++;
		}
		while(col<a[0].length) {
			int c=col;
			int r=0;
			int ele=a[r][c];
			
			while(r<a.length && c<a[0].length) {
				if(ele!=a[r][c]) return false;
				r++;
				c++;
			}
			col++;
					
		}
		return true;
	}

}
