package Aprender;

public class TesteRunnable {

	public static void main(String[] args) {
		MinhaThreadRunnable Thread = new MinhaThreadRunnable("thread #1",1000);
		//Thread t1 = new Thread(Thread);
		//t1.start();
		
		MinhaThreadRunnable Thread2 = new MinhaThreadRunnable("thread #2", 900);
		MinhaThreadRunnable Thread3 = new MinhaThreadRunnable("thread #3", 500);
		

	}

}
