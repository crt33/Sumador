import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Celia
 *
 */

public class TestASumar {

	/**
	 * prueba con n�mero de s�lo un d�gito
	 */
	
	@Test
	public void testUnaCifra() {
		ASumar sumi = new ASumar("7");
		String resultado = sumi.mostrar();
		assertEquals("7=7",resultado);
	}

}
