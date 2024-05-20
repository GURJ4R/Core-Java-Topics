package core.java.main.Interface;

public interface ExtendedInterface {
      void abstractMethod();
      
      default void defaultMethod() {
    	  System.out.println("this is default method");
      }
      
      static void staticMethod() {
    	  System.out.println("this is static method in the interface");
      }
      
      int CONSTANT_VALUE=100;
}
