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

	/**
	 * prueba con n�mero negativo
	 */
	
	@Test
	public void testNegativo() {
		ASumar sumi = new ASumar("-1");
		String resultado = sumi.mostrar();
		assertEquals("",resultado);
		}
	
	/**
	 * prueba con n�mero de m�s de un d�gito
	 */
	
	@Test
	public void testmasde1digito() {
		ASumar sumi = new ASumar("12");
		String resultado = sumi.mostrar();
		assertEquals("5 + 7 = 12", resultado);
        }
	}
