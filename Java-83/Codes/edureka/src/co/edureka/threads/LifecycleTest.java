package co.edureka.threads;

public class LifecycleTest {

	public static void main(String[] args) throws InterruptedException {
		Thread mt = Thread.currentThread();
		System.out.println(mt);
		
		for(int i=1;i<=8;i++) {
			System.out.println(mt.getName()+" -- " + i);
			Thread.sleep(2000);
			if(i==4)
				mt.stop();
		}
	}
}
