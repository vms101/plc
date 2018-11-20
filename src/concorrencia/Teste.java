package concorrencia;

public class Teste {

	public static void main(String[] args) {
		int aux = 100;
		for(int i=1; i<=2; i++) {
			MinhaThread thread = new MinhaThread("#"+i, aux);
			aux+=500;
		}
			//thread.start();
	}

}
