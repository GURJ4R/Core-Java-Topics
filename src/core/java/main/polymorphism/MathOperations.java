package core.java.main.polymorphism;


//this class is implementation of Compile-time polymorphism

public class MathOperations {
   public int add(int a , int b) {
	   System.out.println("int method called");
	   return a+b;
   }
   
   public double add(double a , double b) {
	   System.out.println("double method called");
	   return a+b;
   }
}
