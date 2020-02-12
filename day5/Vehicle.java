package weekday.day5;

public class Vehicle  {

	public void applyBrake() {
		System.out.println("normal brake");

	}
	
	public void applyHorn() {
		System.out.println("applied Horn");

	}
	
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		
		//veh.applyBrake();
		veh.applyHorn();
	}

}
