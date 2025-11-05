package logica;

public class SinRaicesRealesException extends Exception {
	
    private static final long serialVersionUID = 1L;
    
    public SinRaicesRealesException(String mensaje) {
        super(mensaje);
    }
}
//si el discriminante es menor 0 no hay raices reales para la ecuacion.

