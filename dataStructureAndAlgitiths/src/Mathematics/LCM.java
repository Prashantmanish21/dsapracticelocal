package Mathematics;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(lcmOfTwoNum(a, b));
		int lcm=(a*b)/gcd(a, b);
		System.out.println(lcm);
;
	}

	private static int lcmOfTwoNum(int a,int b) {
		int max = Math.max(a, b);
		while (true) {
			if (max % a == 0 && max % b == 0) {
				return max;
			}

			max++;

		}
	}
	public static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
	   return gcd(b,a%b);
	}

}
