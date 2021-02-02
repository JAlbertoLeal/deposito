import static org.junit.Assert.*;

import org.junit.Test;

public class prueba6 {
    DepositoCombustible tanque = new DepositoCombustible(40.0,15.0);

	@Test
	public void consumirTest() {
		double resultado = tanque.consumir(5.0);
		double esperado = 10.0;
		assertEquals(esperado, resultado,0);
	}

}
