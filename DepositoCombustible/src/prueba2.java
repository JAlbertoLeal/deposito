import static org.junit.Assert.*;

import org.junit.Test;

public class prueba2 {
    DepositoCombustible tanque = new DepositoCombustible(40.0,0.0);

	@Test
	public void getDepositoMaxTest() {
		double resultado = tanque.getDepositoMax();
		double esperado = 40.0;
		assertEquals(esperado, resultado, 0);
	}

}
