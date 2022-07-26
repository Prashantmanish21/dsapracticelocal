package arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr1=new int[n];
		int m=sc.nextInt();
		int []arr2=new int[m];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		int sum[]=new int[n>m?n:m];
		int carry=0;
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=sum.length-1;
		while(k>=0) {
			int d=carry;
			if(i>=0) {
				d=d+arr1[i];
			}
			if(j>=0) {
			    d=d+arr2[j];
			}
			carry=d/10;
			d=d%10;
			sum[k]=d;
			i--;
			k--;
			j--;
		}
		if(carry!=0) {
			System.out.println(carry);
		}
		for(int val:sum) {
			System.out.println(val);
		}
	}
	

}
