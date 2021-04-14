package labs_examples.multi_threading.labs;


/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

public class Exercise1 implements Runnable{

    Thread thread;


    public Exercise1(String name) {
        thread = new Thread(this,name);
        thread.start();
    }
    @Override
    public void run() {
        System.out.println(thread.getName() + " this is the run method");
    }
}
