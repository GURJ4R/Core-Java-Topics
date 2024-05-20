package core.java.main.Interface;


//This is Implementation class for Interface Animal

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog is Eating");

	}

	@Override
	public void Sleep() {
		System.out.println("Dog is Sleeping");
	}

}
