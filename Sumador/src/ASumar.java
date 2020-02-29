/**
 * 
 * @author Celia
 *
 */

public class ASumar {

	private String valor_inicial;
	
	/**
	 * 
	 * @param string
	 * 
	 */
	
	public ASumar(String string) {
		this.valor_inicial = string;
	}
	
	/**
	 * 
	 * @return devuelve valor en el caso de que sea número de un dígito
	 * 
	 */

    public String mostrar() {
    	String numero = valor_inicial;
    	if(numero.length() == 1) {
    		return (numero + "=" + numero);
    	}
    	    return null;
    }
}