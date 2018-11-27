package slide3;

import slide2.MinhaThreadRunnable;

public class Teste {

	public static void main(String[] args) {
		MinhaThreadRunnable th1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable th2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable th3 = new MinhaThreadRunnable("#3", 500);
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		Thread t3 = new Thread(th3);
		
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);

		t1.start();
		t2.start();
		t3.start();
	}

}
