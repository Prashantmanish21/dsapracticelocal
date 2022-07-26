package binaryConversion;

import java.util.Scanner;

public class AnyBaseToDecimal {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int base=sc.nextInt();
		int result=conversion(num,base);
		System.out.println(result);
		
	}
	public static int conversion(int n, int base) {
		int result=0;
		int power=1;
		while(n>0) {
			int r=n%10;
			result=result+r*power;
			power=power*base;
			n=n/10;
		}
		return result;
	}

}
