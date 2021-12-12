package co.edureka.threads;

class MyTask2 extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println("No of Active Threads = " + Thread.activeCount());
		
		Thread mt = Thread.currentThread();
		System.out.println(mt);
		
		MyTask2 task = new MyTask2();
		task.start(); 
		
		System.out.println("No of Active Threads = " + Thread.activeCount());
	}
}

