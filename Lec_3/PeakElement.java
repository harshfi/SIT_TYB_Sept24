package Lec_3;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {0,2,5,10,11,5,3,2,1,0,-1};
		System.out.println(find(a));

	}
	
	public static int find(int[] a) {
		int s=0;
		int e=a.length-1;
		
		while(s<=e) {
			int mid=(s+e)/2;
			
			if(a[mid]<a[mid+1]) s=mid+1;
			else e=mid-1;
			
		}
		return s;
	}

}
