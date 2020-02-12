package weekday.day5;

public class Car extends Vehicle {

	

	public void applyGear() {
		System.out.println("applied gear");

	}

	public static void main(String[] args) {

		Car car = new Car();
		car.applyBrake();
		car.applyGear();
		//car.applyHorn();

		/* Vehicle veh = new Vehicle(); */

	}

}
