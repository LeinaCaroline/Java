package novamente;


public class ContaPagar {

private String descricao;
private Double Valor;         
private String datavencimento;
private Fornecedor fornecedor;

public ContaPagar(){
}	

public void setDescricao(String desc){
	this.descricao = desc;
}
public String getDescriscao() {
	return this.descricao;
}


public void setValor(double Vl) {
	this.Valor = Vl;
}
public double getValor() {
	return this.Valor;
}

public void setDatavencimento(String datav){
	this.datavencimento = datav;
}
public String getDatavencimento() {
	return this.datavencimento;
}

public void setFornecedor(Fornecedor forn) {
	this.fornecedor = forn;
}                                      //Euzinha :)//
public Fornecedor getFornecedor() {
	return this.fornecedor;
}


                    //???
ContaPagar(Fornecedor fornecedor, String descricao,double Valor,String datavencimento){
	 this.descricao = descricao;
	 this.Valor = Valor;
	 this.datavencimento = datavencimento; // será que metodos privados consigo modificar assim ???
	 this.fornecedor= fornecedor;   // Hum.. são construtores kkkk
	
	
}

void pagar() {                         //veja so isso //
	
	System.out.println("Pagando conta " +this.getDescriscao() + " no valor de "+this.getValor()+" do fornecedor "+this.getFornecedor().getNome()+".");
	
	
	
}


}
