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
    
    /**
     * 
     * @return
     */
    
    public int total() {
        int suma = 0;
        for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un dígito.
            String digito = valor_inicial.substring(i, 1);
            suma = suma + Integer.getInteger(digito);
        }
        return suma;
    }
}