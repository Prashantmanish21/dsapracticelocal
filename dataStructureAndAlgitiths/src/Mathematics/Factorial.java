package Mathematics;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		System.out.println(factotial(n));
		
		long factorial=1;
		for(int i=1;i<=n;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
		
	}
	
	public static long factotial(long n) {
		if(n==0) {
			return 1;
		}
		return n*factotial(n-1);
	}

}
