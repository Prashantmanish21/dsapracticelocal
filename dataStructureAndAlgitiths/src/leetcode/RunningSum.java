package leetcode;
import java.lang.*;
import java.util.*;


public class RunningSum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int[]arr=  {3,1,2,10,1};
		int []runSum=arr;
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				runSum[i]=arr[i];
			}
			else {
			runSum[i]=arr[i]+runSum[i-1];
			}
		}
		for(int i=0;i<runSum.length;i++) {
			if(i<runSum.length-1) {
			 System.out.print(runSum[i]+",");
			}else {
				System.out.print(runSum[i]);
			}
		}
		
		
	}
	 

}

