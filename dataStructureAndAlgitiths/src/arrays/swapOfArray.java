package arrays;

public class swapOfArray {
	public static void main(String[]args) {
		int arr[]={1,2,3,4,5};
		int []swapValue=swapArray(arr,1,3);
		for(int i=0;i<swapValue.length;i++) {
			System.out.println(swapValue[i]);
		}
	}

	public  static int[] swapArray(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return arr;
		
	}

}
