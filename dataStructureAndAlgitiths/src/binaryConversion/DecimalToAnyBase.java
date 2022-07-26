package binaryConversion;

import java.util.Scanner;

public class DecimalToAnyBase {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int base=sc.nextInt();
		int result=conversion(n,base);
		System.out.println(result);
	}

	public static int conversion(int n, int base) {
		int result=0;
		int power=1;
		while(n>0) {
			int r=n%base;
			result=result+r*power;
			power=power*10;
			n=n/base;
		}
		return result;
	}

}
