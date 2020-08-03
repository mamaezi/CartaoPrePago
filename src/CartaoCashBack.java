
public class CartaoCashBack extends CartaoPrePago {
	
	int Tipo;
	
public CartaoCashBack(String numeroCartao,String nomeTitular,int anoValidade, int mesValidade, double saldo, int Tipo)
{
		// TODO Auto-generated constructor stub
		super(numeroCartao, nomeTitular, anoValidade,mesValidade, saldo);
	    this.Tipo=Tipo;
	}
 
 
public int getTipo() {
	return Tipo;
}

public void setTipo(int tipo) {
	Tipo = tipo;
}

public String toString() {
	String strTipo="";
	if (this.Tipo == 3) {
		strTipo = "BRONZE";
	}
	else if (this.Tipo == 2) {
		strTipo = "SILVER";
	}
	else if (this.Tipo==1){
		strTipo = "GOLD";
	}
	return "CARTAO CB("+strTipo+"):"+super.numeroCartao+"|"+super.nomeTitular+" ("+super.mesValidade+"/"+super.anoValidade+")  R$ "+super.saldo;
}

public boolean comprar(double valor)
{
	if (this.Tipo==1) //gold
	{
		if (valor<=this.saldo) {
			this.saldo -=valor;
			this.saldo = saldo+valor * 0.08;
			return true;
		}
		else return false;
	}
	else if  (this.Tipo==2) //silver
	{
		if (valor<=this.saldo) {
			this.saldo -=valor;
			this.saldo = saldo+valor * 0.05;
			return true;
		}
		else return false;
	}
	else if (this.Tipo==3) //bronze
	{
		if (valor<=this.saldo) {
		this.saldo -=valor;
		this.saldo = saldo+valor * 0.08;
		return true;
		}
		else return false;
	}
	else return false;
	
}
}

