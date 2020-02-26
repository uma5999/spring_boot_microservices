package com.cc.test;

public class MyThreading {
	public static void main(String[] args) {

		Input ip = new Input();
		Thread t1 = new Thread(new MyThread1(), "Thread1");
		Thread t2 = new Thread(new MyThread2(), "Thread2");
		t1.start();
		t2.start();
	}
}

class MyThread1 extends Thread {
	Input ip = new Input();

	public void run() {
		System.out.println("calling resource thread1");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("inside catch block myThread1");
		}
		ip.getIndex();
	}
}

class MyThread2 extends Thread {

	Input ip = new Input();

	public void run() {
		System.out.println("calling resource thread2");
		ip.getIndex();
	}
}

class Input {

	synchronized public void getIndex() {
		System.out.println("I AM INPUT CLASS");
	}

}
