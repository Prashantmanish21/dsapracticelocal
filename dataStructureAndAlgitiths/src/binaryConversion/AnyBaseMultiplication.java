package binaryConversion;

import java.util.Scanner;

public class AnyBaseMultiplication {
     public static void main(String[]args) {
    	 Scanner sc=new Scanner(System.in);
    	 int n1=sc.nextInt();
    	 int n2=sc.nextInt();
    	 int base=sc.nextInt();
    	 int result=getProduct(n1,n2,base);
    	 System.out.println(result);
    	 
     }

	public static int getProduct(int n1, int n2, int base) {
		int rv=0;
		int p=1;
		while(n2>0) {
			int d2=n2%10;
			n2=n2/10;
			int getsrp=getSingleMultiplication(n1, d2, base);
			rv=Addition(rv, getsrp*p, base);
			p=p*10;
		}
		return rv;
	}

	public static int getSingleMultiplication(int n1, int d2, int base) {
		
		int rv=0;
		int carry=0;
		int p=1;
		while(n1>0||carry>0) {
			int d1=n1%10;
			n1=n1/10;
			int d=d1*d2+carry;
			carry=d/base;
			d=d%base;
			rv=rv+d*p;
			p=p*10;
			
		}
		
		
		return rv;
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
