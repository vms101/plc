package concorrencia;

public class Exe3 implements Runnable{
	private int num;
	private int id;
	static int contador = 0;
	//int contador = 0;
	
	public Exe3(int num, int id) {
		this.num = num;
		this.id = id;
		Thread t = new Thread(this);
		t.start();
	}
	
	public static void main(String[] args) {
		Exe3 thread = new Exe3(10, 1);
		Exe3 thread1 = new Exe3(10, 2);
	}

	public void run() {
		for(int i=1; i<=num; i++) {
			contador +=1;
			System.out.println("#"+id+": "+contador);
		}
	}

}
