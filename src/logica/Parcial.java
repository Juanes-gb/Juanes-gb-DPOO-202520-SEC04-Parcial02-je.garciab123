package logica;

public class Parcial {
	
    public double[] resolverCuadratica(double a, double b, double c)
    		throws CoeficienteInvalidoException, SinRaicesRealesException {
    	
        if (a == 0) {
        	throw new CoeficienteInvalidoException("El coeficiente 'a' no puede ser 0.");
        }
        
        double discriminante = b * b - 4 * a * c;
        
        if (discriminante < 0) {
        	throw new SinRaicesRealesException("No existen raíces reales (discriminante negativo).");
        }
        
        double raiz = Math.sqrt(discriminante);
        double x1 = (-b + raiz) / (2 * a);
        double x2 = (-b - raiz) / (2 * a);
        
        return new double[]{x1, x2};
    }
}
//para esta funcion usé el discriminante para así ver cuantas raices reales tenía la ecuacion dada y poder manejar las excepciones necesarias.
//retorno un arreglo con las dos raices reales de la ecuacion dada.

