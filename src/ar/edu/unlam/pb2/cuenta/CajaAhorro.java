package ar.edu.unlam.pb2.cuenta;

public class CajaAhorro extends Cuenta {

	public CajaAhorro(Double saldo) {
		super(saldo);
		
	}

	int contador = 0;

	public Double extraer(Double cantidad) {
		final int MONTO_EXTRA = 6;
		
		
		if (cantidad < saldo) {
			saldo = saldo - cantidad;
			this.contador = contador +1;
			if (contador > 4)
			saldo = saldo - MONTO_EXTRA;
		}
		
			
		return saldo;
	}

}
