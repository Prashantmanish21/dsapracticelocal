package binaryConversion;

import java.util.Scanner;

public class AnyBaseToAnyBase {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		int getDecimalValue=anyBaseTodecimal(num, b1);
		int result=decimalToAnyBase(getDecimalValue, b2);
		System.out.println(result);
		
		
	}
	public static int anyBaseTodecimal(int n, int base) {
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
	public static int decimalToAnyBase(int n, int base) {
		int result=0;
		int decimalbase=10;
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
