
public class CartaoPrePago {

	String numeroCartao;
	String nomeTitular;
	int anoValidade;
	int mesValidade;
	double saldo;
	
	public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}

	
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void adicionarCredito(double valor) {
		//this.saldo = this.saldo+valor;
		this.saldo += valor;
	}
	
	public boolean comprar(double valor) {
		if (valor<=this.saldo) {
			this.saldo -=valor;
			return true;
		}
		else return false;
		
	}
	public String toString() {
		return "Cartao " + this.numeroCartao+ "|"+ this.nomeTitular + "(" + this.mesValidade +"/"+ this.anoValidade + ") R$" + this.saldo;
	}
}
