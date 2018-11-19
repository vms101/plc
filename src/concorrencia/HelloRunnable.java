package concorrencia;

public class HelloRunnable implements Runnable{

	public void run() {
		System.out.println("Com runnable");
	}
	
	public static void main(String[] args) {
		(new Thread(new HelloRunnable())).start();
	}

}
