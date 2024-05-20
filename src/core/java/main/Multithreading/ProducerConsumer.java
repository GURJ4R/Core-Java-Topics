package core.java.main.Multithreading;

import java.util.LinkedList;

/*
 *  ProducerConsumer class contains a shared buffer (a LinkedList) with a capacity of 2.
	The produce() method produces items and adds them to the buffer. It's synchronized to ensure thread safety.
	The consume() method consumes items from the buffer. It's also synchronized to ensure thread safety.
	In the main() method, we create instances of ProducerConsumer, producerThread, and consumerThread.
	The run() method of each thread executes either produce() or consume() method of ProducerConsumer.
	Both producer and consumer threads run concurrently, with the producer producing items and the consumer consuming them from the shared buffer.
 */
public class ProducerConsumer {
	LinkedList<Integer> buffer = new LinkedList<>();
    int capacity = 2;
    
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait();
                }
                System.out.println("Producer produced: " + value);
                buffer.add(value++);
                notify();
                Thread.sleep(1000); // Simulate some work
            }
        }
    }
    
    
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.size() == 0) {
                    wait();
                }
                int val = buffer.removeFirst();
                System.out.println("Consumer consumed: " + val);
                notify();
                Thread.sleep(1000); // Simulate some work
            }
        }
    }

}
