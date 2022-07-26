package Mathematics;

import java.util.Scanner;

public class AllDivisorsOfNum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=Math.sqrt(num);i++) {
			int temp=num;
			int x=i;
			if(num%i==0) {
				//System.out.println(i);
				if(i!=num/i) {
					//System.out.println(num/i);
				}
				
			}
		}
		efficientSol(num);
	}
	public static void efficientSol(int num) {
		int i;
		for(i=1;i*i<num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		for(;i>1;i--) {
			if(num%i==0) {
				System.out.println(num/i);
			}
		}
	}

}
