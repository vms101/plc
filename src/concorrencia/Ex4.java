package concorrencia;

public class Ex4 implements Runnable{
	private int num;
	private int id;
	static int contador = 0;
	static Thread array [] = new Thread [2];
	//int contador = 0;

	public Ex4(int num, int id) {
		this.num = num;
		this.id = id;
	}

	public static void main(String[] args) {

		Ex4 thread = new Ex4(1000, 1);
		Ex4 thread1 = new Ex4(1000, 2);


		Thread t = new Thread(thread);
		Thread t1 = new Thread(thread1);

		array[0] = t;
		array[1] = t1;

		t.start();
		t1.start();
		
		
		while(t.isAlive() || t1.isAlive()) {
			if(!t1.isAlive() && t.isAlive()) {
				t.interrupt();
				System.out.println("#2"+ "acabou primeiro");
			}else if(!t.isAlive() && t1.isAlive()) {
				t1.interrupt();
				System.out.println("#1"+ "acabou primeiro");
			}
		}
	}

	public void run() {
		for(int i=1; i<=num; i++) {
			contador +=1;
			System.out.println("#"+id+": "+contador);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
		//if(array[0].isAlive()) {
				System.out.println("#"+id+" terminou");
			//}
	}

}
