package Mathematics;

import java.util.Scanner;

public class TrailiningZeroes {
	public static void main(String[]args) {
		int n=5;
		//System.out.println(n);
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		//System.out.println(fact);
		int result=0;
		while(fact%10==0) {
			result++;
			fact=fact/10;
		}
		System.out.println(result);
		trailingZeroes();
		
	} public static void trailingZeroes() {
		int num=269;
		int result=0;
		for (int i=5;i<=num;i=i*5) {
			result=result+num/i;
		}
		System.out.print(result);
	}

}
