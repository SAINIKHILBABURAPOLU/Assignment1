package Assignments;


import java.util.Arrays;

public class shuffleTheArray {

	public int [] shuffle(int [] nums, int n) {
		
		int [] ans = new int [2*n];
		
		for (int i = 0; i <n; i++) {
			ans[i*2] = nums[i];
			ans[i*2+1] = nums[i+n];
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shuffleTheArray p = new shuffleTheArray();
		
		int [] nums = {1,1,2,2};
		int n=2;
		
		int [] ans = p.shuffle(nums, n);
		
		System.out.print(Arrays.toString(ans));
	}

}
