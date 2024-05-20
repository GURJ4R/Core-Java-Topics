package core.java.main.inheritance;

/*
 this class is implementation
 of super keyword and this keyword
*/
public class Toyoto extends Car {
	int year;
	
	public Toyoto() {
		this(0);
	}

	public Toyoto(String value, int yearValue) {
		super(value);
		this.year = yearValue;
		System.out.println("this is Toyoto class Constructor with year value " + year);
	}
	public Toyoto(int yearValue) {
		super("blue0");
		this.year=yearValue;
		System.out.println("this is Toyoto class one parameter constructor="+yearValue);
	}

	public void displayToyoto() {
		System.out.println("this is display method of Toyota Class");
	}

}
