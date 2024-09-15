package Lec_3;

public class CountNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		int total_neg=0;
		for (int i = 0; i < a.length; i++) {
			int count= count(a,i);
			total_neg+=(a[i].length-count);
		}
	
		System.out.println(total_neg);
	}
	public static int count(int a[][],int row) {
		int s=0;
		int e=a[row].length-1;
		int ans=0;
		while(s<=e) {
			int mid=(s+e)/2;
			if(a[row][mid]<0) {
				ans=mid;
				e=mid-1;
			}
			else s=mid+1;
		}
		return ans;
	}

}
