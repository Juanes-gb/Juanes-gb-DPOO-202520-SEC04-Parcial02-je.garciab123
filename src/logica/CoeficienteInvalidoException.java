package logica;

public class CoeficienteInvalidoException extends Exception {
	
    private static final long serialVersionUID = 1L;
    
    public CoeficienteInvalidoException(String mensaje) {
        super(mensaje);
    }
}
//parto de que el coeficiente de "a" no puede ser 0 para poder usar la ecuacion cuadratica

