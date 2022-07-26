package Mathematics;

import java.util.Scanner;

public class PrimeFactorsOfNum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<=num;i++) {
			if(checkPrime(num)) {
				int x=i;
				while(num%x==0){
					System.out.println(i);
					x=x*i;
					
				}
			}
		}
		primeFactor(num);
		
		
	}
	public static Boolean checkPrime(int n) {
		if(n==1) {
			return false;
		}
		if(n==2||n==3) {
			return true;
		}
		if(n%2==0||n%3==0) {
			return false;
		}
		for(int i=5;i<=Math.sqrt(n);i=i+6) {
			if(n%i==0||n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	public static void primeFactor(int num) {
		if(num>0) {
			if(num==1) {
				System.out.println("NO PRIME FACTORS");
			}
			if(num==2||num==3) {
				if(num==2) {
				   System.out.println(2);
				}else {
					System.out.println(3);
				}
			}
			if(num%2==0 || num%3==0) {
				while(num%2==0) {
					System.out.println(2);
					num=num/2;
				}
				while(num%3==0) {
					System.out.println(3);
					num=num/3;
				}
			}
			int temp=num;
			for(int i=5;i<=Math.sqrt(num);i=i+6) {
				while(temp%i==0) {
					System.out.println(i);
					temp=temp/i;
				}
				while(temp%(i+2)==0) {
					System.out.println(i+2);
					temp=temp/(i+2);
				}
			}
			
		}
		if(num>1) {
			System.out.println(num);
		}
	}

}
