package Aprender;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno1 aluno = new Aluno1();
		
		//como criar um construtor aqui para iniciar ? e ainda temos Getts e Setts //
		Professor1 professor = new Professor1();
		float[] notas = new float[3];
		
		
		System.out.println("Informe os dados do aluno:  \n  nome:");
		String nome = sc.nextLine();
		aluno.setNome(nome);
		
		System.out.println(" Endereco:");
		String endereco = sc.next();
		sc.nextLine();
		aluno.setEndereco(endereco);
		
		System.out.println("Telefone:");
		String telefone = sc.next();
		sc.nextLine();
		aluno.setTelefone(telefone);
		
		System.out.println("CPF:");
		String cpf = sc.next();
		sc.nextLine();
		aluno.setCpf(cpf);
		
		System.out.println("Curso:");
		String curso = sc.next();
		sc.nextLine();
		aluno.setCurso(curso);
		
		System.out.println("Informe as notas de :" +aluno.getNome());
		
		
		
		
		
		
		// Parei na parte de coletar as notas e tirar a media 
		// ou seja parei na parte de usar os metodos das Classes :)

		for(int i= 0;i<3;i++) {
			System.out.println("nota "+(i+1));
			notas[i] = sc.nextFloat();
			aluno.setNotas(notas); //show de bola 
			
			
		}
		
	    //aluno.calcularMedia();
		
		System.out.println("A media do(a) aluno(a) "+aluno.getNome()+"  é : "+aluno.calcularMedia());
	
		System.out.println("A situação de aprovação do(a) aluno(a) "+aluno.getNome()+"  é : "+aluno.verificarAprovado());
		
		
		
		
      // Dados do professor //
		professor.setNome("Alex");
	
		professor.setEndereco("Rua Amarela");
		
		professor.setTelefone("455785");
		
		professor.setDepartamento("Departamento deCiencias Humanas");
		
		professor.setNomeCurso("Pedagogia");
		
		professor.setSalario(2500f);
		
		
		
		
	}

}
