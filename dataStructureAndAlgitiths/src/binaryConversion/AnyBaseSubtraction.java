package binaryConversion;

import java.util.Scanner;

public class AnyBaseSubtraction {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int base=sc.nextInt();
		int result;
		if(n1>n2) {
			result=subtraction(n1,n2,base);
		}else {
			result=subtraction(n2,n1,base);
		}
		System.out.println(result);
		
	}

	public static int subtraction(int n1, int n2, int base) {
		int rv=0;
		int carry=0;
		int p=1;
		while(n1>0||n2>0||carry>0) {
			int d1=n1%10;
			int d2=n2%10;
			n1=n1/10;
			n2=n2/10;
			int d;
			d1=d1-carry;
			if(d1>d2) {
				d=d1-d2;
				carry=0;
			}else if(d1==d2) { 
				d=d1-d2;
			    carry=0;
			}else {
				d1=base+d1;
				d=d1-d2;
				carry=d1/base;
			}
			rv=rv+d*p;
			p=p*10;
		}
		
		
		return rv;
	}

}
