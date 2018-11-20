package concorrencia;

public class MinhaThread extends Thread{
	
	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}
	
	public void run() {
		try {
			for(int i=1; i<=5; i++) {
				System.out.println("Executando a thread "+nome+" pela "+i+" vez");
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}System.out.println(nome+" terminou a execucao");
	}
}
