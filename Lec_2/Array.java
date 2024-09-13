package Lec_2;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int a[]= {6,1,2,5,2,3,4};
		 int a[]= new int[7];
		 a[0]=6;
		 a[1]=1;
		 a[2]=2;
		 a[3]=5;
		 a[4]=2;
		 a[5]=3;
		 a[6]=4;
        print(a);
        Arrays.sort(a);
        System.out.println();
        
        print(a);
        System.out.println();
        System.out.println(sum(a));
	}
	public static int sum(int a[]) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		return sum;
		
	}
	static void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
