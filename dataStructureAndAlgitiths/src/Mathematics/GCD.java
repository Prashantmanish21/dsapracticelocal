package Mathematics;

import java.util.Scanner;

public class GCD {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(gcd(a,b));
		System.out.println(gcD(a,b));
		System.out.println(recursiveSolOfGcd(a, b));
	}

	private static int gcD(int a, int b) {
		while(a!=b){
			if(a>b) {
				a=a-b;
			}else {
				b=b-a;
			}
		}
		return a;
	}


	private static int gcd(int a, int b) {
		int min=min(a,b);
		while(min>0) {
			if(a%min==0 &&b%min==0) {
				break;
			}
			min--;
		}
		return min;
		
	}

	private static int  min(int a, int b) {
	    if(a<b) {
	    	return a;
	    }
	    return b;
		
	}
	public static int recursiveSolOfGcd(int a,int b) {
		if(b==0) {
			return a;
		}
		return recursiveSolOfGcd(b, a%b);
	}

}
