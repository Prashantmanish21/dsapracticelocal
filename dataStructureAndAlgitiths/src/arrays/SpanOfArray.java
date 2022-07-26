package arrays;

public class SpanOfArray {
	public static void main(String[]args) {
		int arr[]= {10,30,60,23,90,1};
		int min=min(arr);
		int max=max(arr);
		int span=max-min;
		System.out.println("max is :" + max+ " ,"+ "min is :"+  min+ " ,"+ "span is :"+ span);
	}

	public static int max(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i] ){
				max=arr[i];
			}
		}
		return max;
	}

	public static int min(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i] ){
				min=arr[i];
			}
		}
		return min;
	}

}
