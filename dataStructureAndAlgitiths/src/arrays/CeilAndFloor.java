package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CeilAndFloor {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int[]arr= {10,30,99,55,103,41,85,34,89,78};
		int searchVal=sc.nextInt();
		Arrays.sort(arr);
		for(int val:arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println(ceil(arr, searchVal));
		System.out.println(floor(arr, searchVal));
	}

	public static int floor(int[] arr, int searchVal) {
		int lo=0;
		int hi=arr.length-1;
		int mid;
		int ceil=0;
		int floor=0;
		while(lo<=hi) {
			mid=(lo+hi)/2;
			if(searchVal>arr[mid]) {
				lo=mid+1;
				floor=arr[mid];
			}else if(searchVal<arr[mid]) {
				hi=mid-1;
				ceil=arr[mid];	
			}else {
				ceil=arr[mid];
				floor=arr[mid];
				
			}
		}
		return floor;
	}

	public  static int ceil(int[] arr, int searchVal) {
		int lo=0;
		int hi=arr.length-1;
		int mid;
		int ceil=0;
		int floor=0;
		while(lo<=hi) {
			mid=(lo+hi)/2;
			if(searchVal>arr[mid]) {
				lo=mid+1;
				floor=arr[mid];
			}else if(searchVal<arr[mid]) {
				hi=mid-1;
				ceil=arr[mid];
					
			}else {
				ceil=arr[mid];
				floor=arr[mid];
				
			}
		}
		return ceil;
	}

}
