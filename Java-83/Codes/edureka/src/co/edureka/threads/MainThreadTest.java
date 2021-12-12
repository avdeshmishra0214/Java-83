package co.edureka.threads;

public class MainThreadTest {

	public static void main(String[] args) {
		int threadCount = Thread.activeCount();
		System.out.println("No of Active Threads = " + threadCount);
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("Name : " + t.getName());
		System.out.println("Priority : " + t.getPriority());
		ThreadGroup tgp = t.getThreadGroup();
		System.out.println(tgp);
		
		t.setName("edureka");
		t.setPriority(10);
		//t.setPriority(11); //java.lang.IllegalArgumentException
		System.out.println(t);
	}
}