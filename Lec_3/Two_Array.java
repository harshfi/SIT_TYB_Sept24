package Lec_3;

import java.util.Arrays;

public class Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[][] = new int[4][5];
		//a[row][col]=1;
		
		int a[][]= {{6,7,1,2},
				    {8,2,8,9},   
				    {0,2,-1,0},
				    {8,4,7,1}};
		print(a);
		
		for (int i =0;i<a.length;i++) {
			
			Arrays.sort(a[i]);
			
		}
		
		print(a);
		
		  
		}
	static void print(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
		
		

	}


