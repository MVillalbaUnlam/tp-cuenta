package ar.edu.unlam.pb2.cuenta;

public class Cuenta {

	protected Double saldo;
	protected Long cbu;
	
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

	public Long getCbu() {
		return cbu;
	}

	public void setCbu(Long cbu) {
		this.cbu = cbu;
	}

}
