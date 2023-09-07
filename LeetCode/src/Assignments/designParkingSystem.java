package Assignments;

public class designParkingSystem {

	int Big, Medium,Small;
	public designParkingSystem(int big, int medium, int small) {
		
		this.Big=big;
		this.Medium=medium;
		this.Small=small;
		
	}
	public boolean addCar(int carType) {
		switch(carType){
		case 1:
			if(Big>0) {
				Big--;
				return true;
			}
		break;
		
		case 2:
			if(Medium>0) {
				Medium--;
				return true;
			}
			break;
			
		case 3:
			if(Small>0) {
				Small--;
				return true;
			}
		break;
		
		default:
			break;
		
	}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		designParkingSystem p = new designParkingSystem(1, 1, 0);
		
		System.out.println(p.addCar(1));
		System.out.println(p.addCar(2));
		System.out.println(p.addCar(3));
		System.out.println(p.addCar(1));
	}

}
