package Lec_2;

public class MAX_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,-6,5,-3,6,-4,2};
		System.out.println(max_SubArray(a));

	}
	public static int max_SubArray(int a[]) {
		int max=-100;
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			for (int j = i; j < a.length; j++) {
				sum=sum+a[j];
				max=Math.max(max, sum);
			}
		}
		return max;
	}

}
