package core.java.main.Multithreading;

public class MyThreadState extends Thread {
	
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is in the " + Thread.currentThread().getState() + " state");
        System.out.println("Thread " + getName() + " with priority " + getPriority());
    }
}
