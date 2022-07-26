package searchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int[]arr= {10,30,99,55,103,41,85,34,89,78,10};
		int searchVal=sc.nextInt();
		Arrays.sort(arr);
		for(int val:arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println(binarySearch(arr, searchVal));
	}
	public static int binarySearch(int []arr,int val) {
		int lo=0;
		int hi=arr.length-1;
		int mid;
		while(lo<=hi) {
			mid=(lo+hi)/2;
			if(val>arr[mid]) {
				lo=mid+1;
			}else if(val<arr[mid]) {
				hi=mid-1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}

}
