package Aprender;

public class MinhaThread extends Thread {

	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
			
	}
	

	public void run(){
		 try {
	for(int i= 0; i<6;i++) {
		System.out.println(nome+" - "+(i+1));	
			Thread.sleep(tempo); 
		
	}
		 }
	
	 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
			System.out.println("Fim da execução");	
	}
	
	
	
	
	
	
	
}
