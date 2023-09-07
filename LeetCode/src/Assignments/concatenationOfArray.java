package Assignments;

import java.util.Arrays;

public class concatenationOfArray {
	
	public int[]getConcatenation(int [] nums){
		int n = nums.length;
		int []ans = new int [2 * n];
		
		for(int i =0; i<n;i++) {
			ans[i] = nums[i];
			ans[i+ n]= nums[i];
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concatenationOfArray p = new concatenationOfArray();
		int [] nums = {1,2,1};
		int [] ans = p.getConcatenation(nums);
	
		
		System.out.println(Arrays.toString(ans));
	}
}
