package arrays;

import java.util.Scanner;

public class BarChart {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=max(arr);
		while(max>0) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>=max) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			max--;
		}
		
	}

	public  static int max(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
