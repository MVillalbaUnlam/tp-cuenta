package ar.edu.unlam.pb2.cuenta;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {

	@Test
	public void testCajaDeAhorro() {

		CajaAhorro cuenta1 = new CajaAhorro(500.0);

		cuenta1.extraer(50.0);
		cuenta1.extraer(50.0);
		cuenta1.extraer(50.0);
		cuenta1.extraer(50.0);
		cuenta1.extraer(50.0);

		Double valorEsperado = 244.0;

		Assert.assertEquals(valorEsperado, cuenta1.getSaldo());
	}

	@Test

	public void testCuentaCorriente() {

		CuentaCorriente cuenta1 = new CuentaCorriente(100.0);

		cuenta1.extraer(200.0);

		Double valorEsperado = -105.0;

		Assert.assertEquals(valorEsperado, cuenta1.getSaldo());

	}

	@Test

	public void testCuentaSueldo() {

		CuentaSueldo cuenta1 = new CuentaSueldo(100.0);

		cuenta1.extraer(150.0);
		cuenta1.getSaldo();

	}
}
