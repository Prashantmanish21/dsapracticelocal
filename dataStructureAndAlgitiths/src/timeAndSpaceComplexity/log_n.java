package timeAndSpaceComplexity;
import java.lang.*;
import java.util.*;

public class log_n {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=0;
		int n=sc.nextInt();
		int m=sc.nextInt();
		while(n>0) {
			a+=n;
			n=n/2;
		}
		System.out.println(a);
		int i=1;
		while(i<m) {
			b+=i;
			i=i*2;
		}
		System.out.println(b);
		
	}
	

}
