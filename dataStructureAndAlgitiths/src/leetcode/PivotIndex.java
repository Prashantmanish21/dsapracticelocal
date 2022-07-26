package leetcode;

public class PivotIndex {
	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		int leftSum;
		int rightSum ;
		int k = 0;
		for (; k < nums.length; k++) {
			leftSum=0;
			rightSum=0;
			for (int i = 0; i < k; i++) {
				leftSum = leftSum + nums[i];
				//System.out.println(leftSum);
			}
			

			for (int j=nums.length-1; j > k; j--) {
				rightSum = rightSum + nums[j];
				//System.out.println(rightSum);
			}
			if (leftSum == rightSum) {
				System.out.println(k);
				

			}

		}
		
	}

}
