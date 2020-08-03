
public class Compra {

	public Compra() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	CartaoPrePago c1,c2,c3,c4,c5;
	
	
	c1 = new CartaoPrePago("20102","Work1",2020,6,1000);
	c2 = new CartaoCashBack("30102","work2",2021,7,2000,1);
	
	c3 = new CartaoCashBack("40102","work3",2021,12,3000,2);
	c4 = new CartaoCashBack("50102","work4",2021,1,500,3);
	
	c5 = new CartaoCashBack("60102","work5",2021,1,400,1);
	
//	c1 = new CartaoPrePago("20102","Work1",2020,6,1000);
	//c2 = new CartaoCashBack("30102","work2",2021,7,2000,1);
	
	
	//c1.comprar(500);
	//c2.comprar(300);
	
	System.out.println ("Titular " + c1.getNomeTitular() +  " saldo R$ " + c1.getSaldo());
	System.out.println ("Titular " + c2.getNomeTitular() +  " saldo R$ " + c2.getSaldo() );
	System.out.println ("Titular " + c3.getNomeTitular() +  " saldo R$ " + c3.getSaldo() );
	System.out.println ("Titular " + c4.getNomeTitular() +  " saldo R$ " + c4.getSaldo() );
	System.out.println ("Titular " + c5.getNomeTitular() +  " saldo R$ " + c5.getSaldo() );
  
  if (c1.comprar(500)) {
	  System.out.println ("saldo em c1 " + c1.getSaldo());
  }
	  else {
		  System.out.println("debito nao autorizado em c1");			  
	  }
	  
  if (c2.comprar(300)) {
	  System.out.println ("saldo em c2 " + c2.getSaldo());
  }
	  else {
		  System.out.println("debito nao autorizado em c2");			  
	  }
  
  if (c3.comprar(500)) {
	  System.out.println ("saldo em c3 " + c3.getSaldo());
  }
	  else {
		  System.out.println("debito nao autorizado em c3");			  
	  }
  
  if (c4.comprar(500)) {
	  System.out.println ("saldo em c4 " + c4.getSaldo());
  }
	  else {
		  System.out.println("debito nao autorizado em c4");			  
	  }
  
  if (c5.comprar(500)) {
	  System.out.println ("saldo em c4 " + c5.getSaldo());
  }
	  else {
		  System.out.println("debito nao autorizado em c5");			  
	  }
		 
}

}