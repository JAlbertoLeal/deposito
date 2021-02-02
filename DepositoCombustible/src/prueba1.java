

import static org.junit.Assert.*;

import org.junit.Test;

public class prueba1 {
    DepositoCombustible tanque = new DepositoCombustible(40.0,0.0);

	@Test
	public void getDepositoNivelTest() {
		double resultado = tanque.getDepositoNivel();
		double esperado = 0.0; // el esperado será 0.0
		assertEquals(esperado, resultado,0);
	}

}
