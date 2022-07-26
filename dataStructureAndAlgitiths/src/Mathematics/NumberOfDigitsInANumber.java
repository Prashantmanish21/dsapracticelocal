package Mathematics;
import java.util.*;

public class NumberOfDigitsInANumber {
	  public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		  iterativeSolution(num);
		  System.out.println(recursiveSolution(num));
		 
		
	}
	  
	

	public static void iterativeSolution(int num) {
          int count=0;
		  
		  while(num>0 && num!=0) {
			  num= num/10;
			  count++;
		  }
		  System.out.println(count);
	  }
	  public static int recursiveSolution(int num) {
		  if(num==0) {
			  return 0;
		  }
		  
		  return  1+recursiveSolution(num/10);
		  
	  }

}
