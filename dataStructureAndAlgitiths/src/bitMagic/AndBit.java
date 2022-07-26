package bitMagic;

public class AndBit {
	public static void main (String[]args) {
		int x=9;
		int y=11;
		binaryRepresentation(128);
	}

	public static void binaryRepresentation(int x) {
		int num=x;
		int sum=0;
		while(num>=1) {
			int r=num%2;
			num=num/2;
			sum=sum*10+r;
		}
		System.out.println(reverseSum(sum));
	}

	public static int reverseSum(int sum) {
		int newSum=0;
		while(sum>0) {
		int r=sum%10;
		newSum=newSum*10+r;
		sum=sum/10;
	}
	return newSum;

  }
}
