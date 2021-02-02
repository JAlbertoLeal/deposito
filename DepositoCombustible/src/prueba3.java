import static org.junit.Assert.*;

import org.junit.Test;

public class prueba3 {
    DepositoCombustible tanque = new DepositoCombustible(40.0,0.0);

	@Test
	public void estaVacioTest() {
		boolean resultado = tanque.estaVacio();
		boolean esperado = true;
		assertEquals(esperado, resultado);
	}

}
