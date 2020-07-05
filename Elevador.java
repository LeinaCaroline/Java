package novamente;

 public class Elevador{
	 private int andar_atual = 0;
	 private int andares;
	 private int capacidade;
	 private int numPessoas;
	 int cont;
	 
	       //andar_atual
		 public void setAndar_Atual(int and){
			 this.andar_atual = and;
		 }
	     public int getAndar_Atual(){
			 return this.andar_atual;
	
	     }
	 
	     //andares
		 public void setCapacidade(int cap){
			 this.capacidade = cap;
			 //limite=this.capacidade;
		 }
         public float getCapacidade(){
			 return this.capacidade;
		 }
         
           //capacidade
         public void setAndares(int and){
			 this.andares = and;
		 }
         public int getAndares(){
			 return this.andares;
        }
         
         //numPessoas
         public void setNumPessoas(int quant){
			 this.numPessoas= quant;
		 }
         public int getNumPessoas(){
			 return this.numPessoas;
         }
         
        
         
       
         
         
 }
