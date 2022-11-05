package com.company;

public class Main {

    public static void main(String[] args) {
	Thread thread = new Thread(() -> {

        System.out.println("We are in thread " + Thread.currentThread().getName() );
    });
    thread.setName("new worker thread");
    thread.setPriority(Thread.MAX_PRIORITY);
    System.out.println("We are in thread " + Thread.currentThread().getName() + "before");
    thread.start();
        System.out.println("We are in thread " + Thread.currentThread().getName() + "before");
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {

            }
        });
    }


}
