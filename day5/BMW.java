package weekday.day5;

public class BMW extends Car {

	public void sunRoof() {
		System.out.println("sunroof on");

	}

	public void applyBrake() {
		System.out.println("ABS brake");

	}

	public static void main(String[] args) {
	   BMW bmw = new BMW();
		
		bmw.applyBrake();

		/*
		 * bmw.applyBrake(); bmw.applyGear(); //bmw.applyHorn(); bmw.sunRoof();
		 */
	}

}
