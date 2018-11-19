package concorrencia;

import java.util.Scanner;

public class Ex1 extends Thread{
	int inicio;
	int fim;
	static int numeros;
	static int nThreads;
	int id;
	
	public Ex1(int a, int b, int c) {
		inicio=a;
		fim=b;
		id=c;
	}
	
	public void run() {
		for(int i=inicio; i<=fim; i++) {
			System.out.print(i+" ");
		}System.out.println("#"+id+" terminou!");
	}
	
	public static void main(String[] args) {
		//imprimir de 1 a 20
		//2 thread, cada uma imprime 10 numeros
		Scanner in = new Scanner(System.in);
		
		int aux=1;
		
		System.out.println("Digite a quantidade de numeros: ");
		numeros=in.nextInt();
		
		System.out.println("Digite a quantidade Threads: ");
		nThreads=in.nextInt();
		
		int media = numeros/nThreads;
		
		for(int i=1; i<=nThreads; i++) {
			(new Ex1(aux, media+aux-1, i)).start();
			aux=media+aux;
		}
	}

}
