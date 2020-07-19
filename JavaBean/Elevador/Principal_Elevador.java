package novamente;
import java.util.Scanner;

public class Principal_Elevador {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  Elevador elevador = new Elevador();
	  elevador.setCapacidade(5);
	  elevador.setAndares(15);
	  elevador.setNumPessoas(4);
	  int cont=0, andar=0;
	
	  
	  int num;
	  
	// Gerenciando a entrada e saida de pessoas do elevador
	  
	  do {
			
		  System.out.println("Qual alternativa vc escolhe:  \n 1- Entrar \n 2- Sair\n 3- Subir\n 4- Descer\n 5- Escolher um andar");
		  num = sc.nextInt();
			
			switch (num) {
		
			case 1:
				cont++;
				if(cont==5) {
					System.out.println("Não há mais espaço !");
				}
				break;
				
			case 2: 
				if(cont!=0) {
					cont--;
					System.out.println("Opção sair atendida.");
					System.out.println("Qual alternativa vc escolhe:  \n 1- Entrar "
							+ "\n 2- Sair\n 3- Subir\n 4- Descer\n 5- Escolher um andar");
					  num = sc.nextInt();
				}
				break;
				
			case 3:
				if(elevador.getAndar_Atual()!=15) {
					System.out.println("Opção subir atendida.");
					
				}
				break;
			case 4: 
				if(elevador.getAndar_Atual()!=0) {
					System.out.println("Opção descer atendida.");
				}
				
				break;
				
			case 5:
				System.out.println("Para qual andar deseja ir ?");
				andar = sc.nextInt();
				if(andar< elevador.getAndares()) {
					System.out.println("Opção subir atendida.");
					System.out.println("Estamos no "+andar+"andar");
				}
				else if(andar>elevador.getAndares()){
					System.out.println("Opção descer atendida.");
					System.out.println("Estamos no "+andar+"andar");
				}
	
			}
			
			if(cont==0) {
				System.out.println("Elevador pronto.");
			}
			
				
			
			
	  }while(num==1 && cont<5 && cont!=0);

  
	  
	  
	  
 }


}


