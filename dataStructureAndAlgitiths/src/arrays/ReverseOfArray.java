package arrays;

import java.util.Scanner;

public class ReverseOfArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length/2;i++) {
			swap(arr,i,arr.length-1-i);
		}
		System.out.print("[");
		for(int var:arr) {
			System.out.print(var+",");
		}
		System.out.print("]");
		
	}
	public static int[] swap(int[]arr,int x,int y){
		int temp=arr[y];
		arr[y]=arr[x];
		arr[x]=temp;
		return arr;
	
	}

}
