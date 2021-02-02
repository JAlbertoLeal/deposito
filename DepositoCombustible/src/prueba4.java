import static org.junit.Assert.*;

import org.junit.Test;

public class prueba4 {
    DepositoCombustible tanque = new DepositoCombustible(40.0,40.0);

	@Test
	public void estaLleno() {
		boolean resultado = tanque.estaLleno();
		boolean esperado = true;
		assertEquals(esperado, resultado);
	}

}
