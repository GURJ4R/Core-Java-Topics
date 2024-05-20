package core.java.main.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {
    /*Checked exceptions are those that are checked at compile-time by the compiler.
     * Any method that might throw a checked exception must declare it using a throws clause or handle it using a try-catch block.
     * These exceptions typically represent error conditions that might occur during normal execution, such as file I/O errors, database connection issues, etc.
     * Checked exceptions are subclasses of Exception but not subclasses of RuntimeException.
     */
	public static void checkedExceptionMethod() {
		try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

	}
	
	/*
	 * Unchecked exceptions are those that are not checked at compile-time by the compiler.
	 * These exceptions typically represent programming errors or runtime conditions that are beyond the control of the programmer.
	 * Examples of unchecked exceptions include NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, IllegalArgumentException, etc.
	 * Unchecked exceptions are subclasses of RuntimeException.
	 * It's the responsibility of the programmer to handle or avoid unchecked exceptions through proper coding practices such as null checks, array bounds checks, etc.
	 * ArrayIndexOutOfBoundsException also an unchecked
	 */
	public static void uncheckedExceptionMethod() {
		try {
            int result = 10 / 0; // ArithmeticException: divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
	}
	
	
	//difference between throw and throws keyword
	public static void doSomething() {
		Scanner sc=new Scanner(System.in);
		boolean flag=sc.nextBoolean();
	    if (flag!=true && !flag) {
	        throw new IllegalArgumentException("Please input boolean value");
	    }
	}
	
	public static void readFile() throws IOException {
	    // Method code that might throw an IOException
		Scanner sc=new Scanner(System.in);
		boolean flag=sc.nextBoolean();
	}
}
