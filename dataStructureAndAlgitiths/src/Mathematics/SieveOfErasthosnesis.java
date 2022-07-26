package Mathematics;

import java.util.Collections;
import java.util.Scanner;

public class SieveOfErasthosnesis {
	public static void main(String[]args) {
		//print all prime numbers equal to or less than N
		//Time complexity:n(log(logn))
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sievePrime(num);
	}

	private static void sievePrime(int num) {
		Boolean[]arr=new Boolean[num+1];
		for(int i=2;i<arr.length;i++) {
			arr[i]=true;
		}
		for(int i= 2;i*i<arr.length;i++) {
			if(arr[i]==true) {
				for(int j=i*i;j<arr.length;j=j+i) {
					arr[j]=false;
				}
			}
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]==true) {
				System.out.println(i);
			}
		}
		
		
	}

}
