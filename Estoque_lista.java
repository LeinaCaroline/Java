package novamente;

public class Estoque_lista {

	Produtos_lista[] produtos; // Um vetor do tipo Objeto Produtos_lista[]
	
	  void listarProdutos() { 
		  System.out.println(" Produtos em estoque");
		  System.out.println("------------------------");     
		  for (int i = 0; i < produtos.length; i++) {  // ele chama isso o tempo todo indice por indice
			  produtos[i].descrever();  
		  }
		         // UM vetor é um objeto composto de objetos //
		}
	  }


