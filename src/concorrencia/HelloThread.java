package concorrencia;

public class HelloThread extends Thread{
	
	public void run() {
		System.out.println("Olá, sou uma Thread!");
	}
	
	public static void main(String args[]) {
		for(int i=0; i<=4; i++) {
			(new HelloThread()).start();
		}
	}
}