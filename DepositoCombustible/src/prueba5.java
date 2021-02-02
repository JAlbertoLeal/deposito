import static org.junit.Assert.*;

import org.junit.Test;

public class prueba5 {
    DepositoCombustible tanque = new DepositoCombustible(40.0,15.0);

	@Test
	public void fillTest() {
		double resultado = tanque.fill(5.0);
		double esperado = 20.0;
		assertEquals(esperado, resultado,0);
	}

}
