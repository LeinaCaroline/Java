package Aprender;

public class Aluno1 extends Pessoa1{

	private String curso;
	private float [] notas;
	public float soma = 0;
	public float media;
	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	public float [] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	
	
   public float calcularMedia() {
	   
	   for(int i= 0;i<3;i++) {
			soma+=notas[i];
			
	}
	   		media = soma/3;
	   		
		return media;
	}
   
   
	
	public boolean verificarAprovado(){
		if (media<7) {
			System.out.println("Reprovado !");
			return false;
			
		}
		else if (media>=7) {
			System.out.println("Aprovado !");
			return true;
		}
		return false;
		
		
   
	}
	
	
	
	
}
