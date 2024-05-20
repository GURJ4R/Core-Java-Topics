package core.java.main;

import core.java.main.inheritance.Toyoto;
import core.java.main.polymorphism.Animal;
import core.java.main.polymorphism.Dog;
import core.java.main.polymorphism.MathOperations;
import core.java.main.polymorphism.Cat;
import core.java.main.abstractClass.Shape;
import core.java.main.exceptionHandling.ExceptionHandling;
import core.java.main.fileHandling.ReadFileFromLocalSpace;
import core.java.main.fileHandling.ReadingAndWriting;
import core.java.main.fileHandling.WritingFile;
import core.java.main.Association.Car;
import core.java.main.Association.Driver;
import core.java.main.Encapsulation.BankAccount;
import core.java.main.Multithreading.MyThread;
import core.java.main.Multithreading.MyThreadState;
import core.java.main.Multithreading.ProducerConsumer;
import core.java.main.abstractClass.Circle;

public class coreJavaMain {

	public static void main(String[] args) {
		System.out.println("this is Main class");
		
		/*Inheritance implementation with super and this keyword and constructor
		Toyoto obj=new Toyoto();
		Toyoto obj1=new Toyoto("White",2013);
		*/
		
		/*Polymorphism (Runtime-time Method overriding)
		
		Animal dog=new Dog();
		Animal cat=new Cat();
		dog.Sound();
		cat.Sound();
		*/
		
     	/*Polymorphism (Compile-time Method overloading)
     	
		MathOperations obj=new MathOperations();
		System.out.println("add method response="+ obj.add(1.0,2));
		*/
		
		/*Abstract Class Implementation
		
		Circle obj=new Circle(4);
		System.out.println("area ye h ="+obj.area());
		*/
		
		//Multithreading 
		
		/*MyThread thread1=new MyThread();
		MyThread thread2=new MyThread();
		
		thread1.start();
		thread2.start();
		*/
		/*
		 * final ProducerConsumer pc = new ProducerConsumer();

	        Thread producerThread = new Thread(new Runnable() {
	            public void run() {
	                try {
	                    pc.produce();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        Thread consumerThread = new Thread(new Runnable() {
	            public void run() {
	                try {
	                    pc.consume();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        producerThread.start();
	        consumerThread.start();
		*/
		
		
		/*Thread State
		 MyThreadState thread3 = new MyThreadState();

	        System.out.println(thread3.getName() + " is in the " + thread3.getState() + " state");

	        thread3.start();

	        try {
	            Thread.sleep(1000); // Let the new thread start
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println(thread3.getName() + " is in the " + thread3.getState() + " state");
		 */
		
		
		/*
		 * Thread Priority
		 MyThreadState th = new MyThreadState();
		 MyThreadState th1 = new MyThreadState();
		 
		 th.setPriority(Thread.MIN_PRIORITY);
		 th1.setPriority(Thread.MAX_PRIORITY);
		 
		 th.start();
		 th1.start();
		 */
		
		
		//Exception Handling
		//ExceptionHandling.checkedExceptionMethod();
		//ExceptionHandling.uncheckedExceptionMethod();
//		ExceptionHandling.doSomething();
//		ExceptionHandling.readFile();
		
		
		
//		Encapsulation
		
		  /*  BankAccount account = new BankAccount("123456789");
	        account.deposit(1000);
	        account.withdraw(500);
	        System.out.println("Account Balance: $" + account.getBalance());
		*/
		
		
		//Association
		//1-Unidirectional
		/*
		 * Car myCar=new Car("Tesla Model S"); Driver driver=new Driver("Deepak",myCar);
		 * System.out.println(myCar.getDriverName()+ " is the Driver of "+
		 * myCar.getModel()); driver.drives();
		 */
		
		//2-Bidirectional
		
		
		//File Handling
		/*
		 * ReadFileFromLocalSpace.readFile(); WritingFile.writeFile();
		 */
		
		ReadingAndWriting.readingAndWriting();
	}

}
