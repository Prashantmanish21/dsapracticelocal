package binaryConversion;

import java.util.Scanner;

public class AnyBaseAddition {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int base=sc.nextInt();
		int result=Addition(n1,n2,base);
		System.out.println(result);
		
	}

	public static int Addition(int n1, int n2, int base) {
		int rv=0;
		int carry=0;
		int p=1;
		int digit=0;
		while(n1>0||n2>0||carry>0) {
			int r1=n1%10;
			int r2=n2%10;
			 digit=r1+r2+carry;
			if(digit>=base) {
				carry=digit/base;
				digit=digit%base;
			}else {
				carry=digit/base;
				digit=digit%base;
			}
			rv=rv+digit*p;
			p=p*10;
			n1=n1/10;
			n2=n2/10;
		}
		return rv;
	}

}
