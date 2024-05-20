package core.java.main.abstractClass;

public class Circle extends Shape {
    
	double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	// Implementation of abstract method area() for Circle
	@Override
	public
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}
