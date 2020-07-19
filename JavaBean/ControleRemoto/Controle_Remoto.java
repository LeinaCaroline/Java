package Nova_lista_1;
import java.util.Scanner;

public class Controle_Remoto {
 public static void main(String [] args) {
	 Scanner sc = new Scanner(System.in);
	 Televisor tel = new Televisor();
	 tel.setVolume(10);
	 int cont=0,c;
	 
	 
	 System.out.println("Qual opção voçê prefere ?\n 1- Selecionar um canal\n 2- Selecinar volume ");
	 int opcao = sc.nextInt();
	 
	 
	 
	 switch (opcao) {
	 
	 case 1:
		 System.out.println("Qual canal assistir? ");
		 c = sc.nextInt();
		 tel.setCanal(c);
		 System.out.println("Canal: "+tel.getCanal());
		  break;
	 
	 case 2: 
		 System.out.println("Volume: \n0- Diminuir1- Aumentar");
		 int aux = sc.nextInt(); 
		 
		 if(aux==1) {
			 System.out.println("Precione 1 para aumentar constantemente ");
			 do {
				 System.out.println(" ");
				  aux = sc.nextInt();
				    cont++;
				    
				    tel.setVolume(cont);
				    System.out.println("Volume: "+tel.getVolume());
			 }while(aux==1);
			
			 
		 }
		 
			 if(aux==0) {
				 System.out.println("Precione 0 para diminuir constantemente ");
				 do {
					 System.out.println(" ");
					  aux = sc.nextInt();
					    cont--;
					    
					    tel.setVolume(cont);
					    System.out.println("Volume: "+tel.getVolume());
				 }while(aux==0);
				
				 
			 }
			 break;
			 
	 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	sc.close(); 
 }
}
