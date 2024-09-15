package Lec_3;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,25,77,88,99,100,110,112};
		System.out.println(BS(a,110));

	}
	public static int BS(int a[],int target) {
		int s=0;
		int e=a.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(a[mid]==target) return mid;
			else if(a[mid]>target)e=mid-1;
			else s=mid+1;
		}
		return -1;
	}

}
