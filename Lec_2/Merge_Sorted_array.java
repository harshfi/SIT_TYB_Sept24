package Lec_2;

import java.util.Arrays;
import java.util.Iterator;

public class Merge_Sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,5,10,20};
		int b[]= {2,5,6,8,10};
		int ans[]= new int[a.length+b.length];
		
//		for (int i = 0; i < a.length; i++) {
//			ans[i]=a[i];
//		}
//		int n=a.length;
//		for (int i = 0; i < b.length; i++) {
//			ans[i+n]=b[i];
//		}
//		Arrays.sort(ans);
		ans= merge(a,b);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}
	
	public static int[] merge(int a[],int b[]) {
		int idx=0;
		int i=0;
		int j=0;
		int ans[]= new int[a.length+b.length];
		while(i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				ans[idx]=b[j];
				j++;
			}
			else {
				ans[idx]=a[i];
				i++;
			}
			idx++;
		}
		
		while(i<a.length) {
			ans[idx]=a[i];
			i++;
			idx++;
		}
		while(j<b.length) {
			ans[idx]=b[j];
			j++;
			idx++;
		}
		
		return ans;
	}

}
