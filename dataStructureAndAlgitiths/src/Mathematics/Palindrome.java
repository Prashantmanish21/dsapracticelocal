package Mathematics;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		if(num==reverseOfNumber(num) && num>0) {
			System.out.println(true);
			System.out.println(num  +"rev is" + reverseOfNumber(num));
		}else {
			System.out.println(false);
			System.out.println(num  +"rev is"+ reverseOfNumber(num));
		}
		
	}

	private static int reverseOfNumber(int num) {
		 int rev=0;
		 
		 while(num>0) {
			 rev=rev*10 +(num%10);
			 num=num/10;
		 }
		 return rev;
		
	}

}
