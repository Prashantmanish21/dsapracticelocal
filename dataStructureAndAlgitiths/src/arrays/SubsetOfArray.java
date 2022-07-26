package arrays;

import java.util.Scanner;

public class SubsetOfArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int limit=(int)Math.pow(2, arr.length);
		for(int i=0;i<limit;i++) {
			String set="";
			int temp=i;
			//convert i to binary and use 0's and 1's to know print the element or not
			for(int j=arr.length-1;j>=0;j--) {
				int r=temp%2;
				temp=temp/2;
				if(r==0) {
					set="_\t"+set;
				}else {
					set=arr[j]+"\t"+set;
				}
			}
			System.out.println(set);
		}
	}

}
