package novamente;

public class Principal_Bean {
  public static void main(String[] args) {
	  Fornecedor imobiliaria = new Fornecedor();
	  imobiliaria.setNome("Casa & Cia Negocios imobiliários");
	   Fornecedor mercado = new Fornecedor();
	   mercado.setNome("Mercado do João"); 
	   
	  
	   
	   ContaPagar conta1 = new ContaPagar();
	    conta1.setDescricao("Aluguel da matriz");
	    conta1.setValor(1230d);
	    conta1.setDatavencimento("10/05/2012");
	    conta1.setFornecedor(imobiliaria); // passa um objeto como referencia
	     
	                                      // mandei um objeto //
	    ContaPagar conta2 = new ContaPagar( mercado,"compras do mes", 390d,"19/05/2012"); 
	    ContaPagar conta3 = new ContaPagar( mercado,"Aluguel da filial", 700d, "11/05/2012");
	    
	    
	    conta1.pagar();
	    conta2.pagar(); // importante 
	    conta3.pagar();
	    
	    
	   
	  
	  
	  
	  
  }
}
