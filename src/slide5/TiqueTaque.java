package slide5;

public class TiqueTaque {
	boolean tique;

	synchronized void tique(boolean estaFuncionando) {

		if(!estaFuncionando) {
			tique = true;
			notify();
			return;
		}

		System.out.print("Tique ");
		tique = true;
		notify();

		try {
			while(tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void taque(boolean estaFuncionando){

		if(!estaFuncionando) {
			tique = false;
			notify();
			return;
		}

		System.out.println("Taque ");
		tique = false;
		notify();

		try {
			while(!tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
