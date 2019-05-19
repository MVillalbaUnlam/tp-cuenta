package ar.edu.unlam.pb2.cuenta;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {
	
	
	@Test

	public void testCuentaSueldo() {

		CuentaSueldo cuentaSueldo = new CuentaSueldo(0.0);
		
		cuentaSueldo.extraer(100.0);
		Double saldoObtenido = cuentaSueldo.getSaldo();
		
		Assert.assertFalse(saldoObtenido<0);
		
		
		

	}
	
	
	@Test
	public void testCajaDeAhorro() {

		CajaAhorro cuenta1 = new CajaAhorro(500.0);

		cuenta1.extraer(50.0);
		cuenta1.extraer(50.0);
		cuenta1.extraer(50.0);
		cuenta1.extraer(50.0);
		cuenta1.extraer(50.0);
		cuenta1.extraer(50.0);
		

		Double valorEsperado = 194.0;

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

	public void testCuentaCorrienteExcedeSaldoDescubierto() {

		CuentaCorriente cuenta1 = new CuentaCorriente(100.0);

		cuenta1.extraer(400.0);
		Boolean valorEsperado = true;

				
		Assert.assertTrue(valorEsperado = cuenta1.excedeDescubierto);

	}
	
		
	
	
}
