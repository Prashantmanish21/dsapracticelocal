package Mathematics;

import java.util.Scanner;

public class ChewbaccaNum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextInt();
		long sum=0;
		while(num>0) {
			int r=(int)num%10;
			int newDigit=9-r;
			if(newDigit<r&&newDigit<5) {
				sum=sum*10+newDigit;
			}else {
				sum=sum*10+r;
			}
			num=num/10;
					
					
			
		}
		System.out.println(sum);
	}

}
