package org.horrorcore;


public class ThreadStatesDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000); // TIMED_WAITING state
                synchronized(ThreadStatesDemo.class) {
                    ThreadStatesDemo.class.wait(); // WAITING state
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("New State: " + thread.getState());        // NEW
        thread.start();
        System.out.println("Runnable State: " + thread.getState());   // RUNNABLE
        Thread.sleep(1500); //<- Moved the Thread into a waiting State from outside
        System.out.println("Waiting State: " + thread.getState());    // WAITING
        thread.interrupt();
        Thread.sleep(1000);
        System.out.println("Terminated State: " + thread.getState());
    }
}