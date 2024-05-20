package core.java.main.Association;

public class Driver {
	
	private String name;
	private Car car;
	
	public Driver(String name , Car car) {
		this.name=name;
		this.car=car;
		//for unidirectional
		
		this.car.assignDriver(this);
	}
	
	public void drives() {
		System.out.println(name+" is driving a "+car.getModel());
	}
	
	
	public String getName() {
		return name;
	}
    
	
	
}
