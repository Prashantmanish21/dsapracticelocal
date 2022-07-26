package arrays;

import java.util.Scanner;

public class InverseOfArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int arr1[]=inverseOfArray(arr);
		System.out.print("[ ");
		for(int var:arr1) {
			System.out.print(var+" ");
		}
		System.out.print(" ]");
	}

	public static int[] inverseOfArray(int[] a) {
		int inv[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			inv[temp]=i;
			
		}
		return inv;
		
	}

}
