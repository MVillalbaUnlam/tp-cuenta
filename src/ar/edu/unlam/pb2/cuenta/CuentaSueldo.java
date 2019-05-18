package ar.edu.unlam.pb2.cuenta;

public class CuentaSueldo extends Cuenta {

	
	public CuentaSueldo (Double saldo) {
		super(saldo);
	}
	public Double extraer(Double cantidad) {
		if (cantidad < saldo) {
			saldo = saldo - cantidad;
		} else {
			System.out.println("No posee descubierto");
		}
		return saldo;
	}

}
