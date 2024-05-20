package core.java.main.Association;

public class Car {
	//Unidirectional
     private String model;
     
     public Car(String model) {
    	 this.model=model;
     }
     
     public String getModel() {
    	 return model;
     }
     
     //Bidirectional
     
     private Driver assignedDriver;
     
     public void assignDriver(Driver driver) {
    	 this.assignedDriver=driver;
     }
     
     public String getDriverName() {
    	 return assignedDriver.getName();
     }
}
