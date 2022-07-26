package Mathematics;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(checkPrime(num)) {
			System.out.println("NUMBER IS primeNumber");
		}else {
			System.out.println("NOT PRIME NUMBER");
		}
	}

	private static Boolean checkPrime(int num) {
		int count =0;
		if(num==1){
			System.out.println(++count);
			return false;
		}
		if(num==2 ||num==3) {
			System.out.println(++count);
			return true;
		}
		if(num%2==0 ||num%3==0) {
			System.out.println(++count);
			return false;
		}
		for(int i=5;i<=Math.sqrt(num);i=i+6) {
			System.out.println(++count);
			if(num%i==0||num%(i+2)==0) {
				return false;
			}
		}
		return true;
		
	}

}
