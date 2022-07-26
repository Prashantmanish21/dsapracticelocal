package Mathematics;

import java.util.Scanner;

public class Permutation {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int r=sc.nextInt();
		int num=factorila(n);
		int deno=factorila(n-r);
		int result=num/deno;
		System.out.println(result);
		
	}

	private static int factorila(int n) {
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
