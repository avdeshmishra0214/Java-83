package co.edureka.threads;

class MyTask1 implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("No of Active Threads = " + Thread.activeCount());
		
		Thread mt = Thread.currentThread();
		System.out.println(mt);
		
		MyTask1 task1 = new MyTask1();
		Thread ct = new Thread(task1); // new thread
		ct.start(); //runnable thread
		
		System.out.println("No of Active Threads = " + Thread.activeCount());
	}
}
