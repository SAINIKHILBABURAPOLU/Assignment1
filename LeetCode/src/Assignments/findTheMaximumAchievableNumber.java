package Assignments;

public class findTheMaximumAchievableNumber {
	
	public int theMaximumAchievablex(int num, int t) {
		
		num = num + t *2;
		
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findTheMaximumAchievableNumber p = new findTheMaximumAchievableNumber();
		
		
		System.out.println(p.theMaximumAchievablex(3, 2));
	}

}
