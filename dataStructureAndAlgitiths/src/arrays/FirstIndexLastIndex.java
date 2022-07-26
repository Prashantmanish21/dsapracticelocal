package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstIndexLastIndex {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int searchVal=sc.nextInt();
		int[]arr= {10,30,30,55,103,30,85,34,10,55};
		Arrays.sort(arr);
		for(int val:arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println(firstIndex(arr, searchVal));
		//System.out.println(lastIndex(arr, searchVal));
	}

	public static int lastIndex(int[] arr, int searchVal) {
		int lastIdx=-1;
		int lo=0;
		int hi=arr.length-1;
		int mid;
		while(lo<=hi) {
			mid=(lo+hi)/2;
			if(searchVal>arr[mid] ) {
				lo=mid+1;
			}else if(searchVal<arr[mid]) {
				hi=mid-1;
			}else {
				lastIdx=mid;
				lo=mid+1;
			}
			
		}
		return lastIdx;
	}

	public static int firstIndex(int[] arr, int searchVal) {
		int firstIdx=-1;
		int lo=0;
		int hi=arr.length-1;
		int mid;
		while(lo<=hi) {
			mid=(lo+hi)/2;
			if(searchVal>arr[mid] ) {
				lo=mid+1;
			}else if(searchVal<arr[mid]) {
				hi=mid-1;
			}else {
				firstIdx=mid;
				hi=mid-1;
			}
			
		}
		
		return firstIdx;
	}

}
