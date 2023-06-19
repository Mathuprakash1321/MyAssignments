package week1.day1;

public class Car {
	
	public void driveCar() {
		System.out.println("I am driving a car");
	}
	public void applyBrake() {
		System.out.println("Applying brake as requires");
	}
	private void soundHorn() {
		System.out.println("we should sound horn");
	}
	void isPuncture() {
		System.out.println("car is puncture");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car ca=new Car();
ca.driveCar();
ca.applyBrake();
ca.soundHorn();
ca.isPuncture();
	}

}
