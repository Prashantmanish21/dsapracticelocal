package Mathematics;

import java.util.Scanner;

public class ComputingPower {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(computePowerNaiveSol(a, b));
		System.out.println(recursiveSol(a, b));
		System.out.println(efficientSol(a, b));
		System.out.println(IterativeSol(a, b));
	}

	private static int computePowerNaiveSol(int a, int b) {
		int result=1;
		while(b>0) {
			result=result*a;
			b--;
		}
		return result;
		
	}
	public static int recursiveSol(int a,int b) {
		if(b==0) {
			return 1;
		}
		return a*recursiveSol(a, b-1);
	}
	
	public static int efficientSol(int a,int b) {
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return efficientSol(a, b/2)*efficientSol(a, b/2);
		}else {
			return efficientSol(a, b-1)*a;
		}
	}
	
	public static int IterativeSol(int a,int b) {
		int result=1;
		while(b>0) {
			if(b%2 !=0) {
				//enter into  1 bit
				result=result*a;
			}
			a=a*a;
			b=b/2;
		}
		return result;
	}

}
