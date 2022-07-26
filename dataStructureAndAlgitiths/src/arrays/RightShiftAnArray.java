package arrays;

import java.util.Scanner;

public class RightShiftAnArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		k=k%arr.length;
		if(k<0) {
			k=k+arr.length;
		}
		int li=0;
		int ri=arr.length-1-k;
		reverse(arr,li,ri);
		li=arr.length-k;
		ri=arr.length-1;
		reverse(arr, li, ri);
		li=0;
		ri=arr.length-1;
		reverse(arr,li,ri);
		System.out.print("[");
		for(int var:arr) {
			System.out.print(var+",");
		}
		System.out.print("]");
		
	}

	public  static void reverse(int[] arr, int li,int ri) {
		while(li<ri) {
			int temp=arr[li];
			arr[li]=arr[ri];
			arr[ri]=temp;
			li++;
			ri--;
		}
	}
		
		
	

}
