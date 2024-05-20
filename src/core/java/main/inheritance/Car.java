package core.java.main.inheritance;

//this class is used as SuperClass for Toyoto 

public class Car {
	private String color;

	Car(String value) {
		this.color = value;
		System.out.println("this is Car class constructor with value " + color);
	}

	public static void displayCar() {
		System.out.println("this is displayCar method of Car Class");
	}
}
