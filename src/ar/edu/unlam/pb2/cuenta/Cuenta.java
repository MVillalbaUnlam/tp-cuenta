package ar.edu.unlam.pb2.cuenta;

public class Cuenta {

	protected Double saldo;
	
	
	public Cuenta (Double saldo) {
		this.saldo = saldo;
	}

	public Double depositar(Double cantidad) {
		if (cantidad > 0) {
			saldo = saldo + cantidad;
		}
		return saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


}
