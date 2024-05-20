package core.java.main.Multithreading;

/*
 * Multithreading is a programming concept where multiple threads execute independently
 *  within a single program, allowing tasks to be performed concurrently.
 *  Multithreading can improve the performance and responsiveness of your application by utilizing 
 *  the available resources more efficiently, especially on multi-core processors. 
 *  It can also help in handling multiple tasks simultaneously, such as processing user requests 
 *  while performing background tasks.
 *  In Java, you can create multithreaded programs by extending the Thread class or 
 *  implementing the Runnable interface. 
 *  Then, you override the run() method with the code you want the thread to execute.
 *  Multithreading is useful in various scenarios like concurrent processing of tasks in server applications,
 *   parallel computation in scientific computing, handling user interactions and background tasks in 
 *   GUI applications, and more. Any situation where you can benefit from concurrent execution of 
 *   tasks is a candidate for multithreading.
 *   while multithreading can bring benefits, it also introduces complexities like synchronization 
 *   and coordination between threads to avoid issues like race conditions and deadlocks. So, 
 *   it's essential to use multithreading judiciously and with care.
 */
public class MyThread extends Thread {
      public void run() {
    	  for (int i = 0; i < 5; i++) {
              System.out.println(Thread.currentThread().getId() + " Value: " + i);
              try {
                  Thread.sleep(500); // Simulate some work
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      }
}
