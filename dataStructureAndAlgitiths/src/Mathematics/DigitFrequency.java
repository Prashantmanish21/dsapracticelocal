package Mathematics;

import java.util.Scanner;

public class DigitFrequency {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int digit=sc.nextInt();
		int freq=countDigit(num,digit);
		System.out.println(freq);
	}

	public static int countDigit(int n,int d) {
		int count=0;
		while(n>0) {
			int r=n%10;
			if(r==d) {
				count++;
				
			}
			n=n/10;
				}
		return count;
	}

}
