package arrays;

import java.util.Scanner;

public class FindElement {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int elem=sc.nextInt();
		int result=finedElement(arr,elem);
		System.out.println(result);
	}

	public static int finedElement(int[] arr, int elem) {
		int rv=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==elem) {
				rv=i;
				return rv;
			}
		}
		return rv;
	}

}
