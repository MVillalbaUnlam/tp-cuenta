package ar.edu.unlam.pb2.cuenta;

public class CuentaCorriente extends Cuenta {

	private final Integer DESCUBIERTO = 150;
	private final Double PORCENTAJE = 0.05;

	public CuentaCorriente(Double saldo) {
		super(saldo);
	}

	public Double extraer(Double cantidad) {
		if (cantidad < saldo) {
			saldo = saldo - cantidad;
		}

		else {
			if (cantidad <= saldo + DESCUBIERTO) {
				saldo = saldo - cantidad;
				saldo = saldo + (saldo * PORCENTAJE);
			} else {
				if (cantidad > saldo + DESCUBIERTO) {

					saldo = saldo + DESCUBIERTO - cantidad - (saldo + DESCUBIERTO - cantidad * PORCENTAJE);

					System.out.println("Debes " + saldo);
				}

			}

		}

		return saldo;
	}

}
