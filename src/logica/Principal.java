package logica;

import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Parcial parcial = new Parcial();
        
        System.out.println("Resolver para ax^2 + bx + c = 0");
        System.out.println("Reglas");
        System.out.println("- El coeficiente 'a' NO puede ser igual a 0 (debe ser diferente de cero).");
        System.out.println("- Solo se permiten números reales.");
        System.out.println("- Si el discriminante (b^2 - 4ac) es negativo, no existen raíces reales.");
        
        try {
            System.out.print("Ingresa a: ");
            double a = in.nextDouble();
            
            System.out.print("Ingresa b: ");
            double b = in.nextDouble();
            
            System.out.print("Ingresa c: ");
            double c = in.nextDouble();
            
            double[] raices = parcial.resolverCuadratica(a, b, c);
            
            System.out.println("Raíz x1 = " + raices[0]);
            System.out.println("Raíz x2 = " + raices[1]);
            
        } catch (CoeficienteInvalidoException | SinRaicesRealesException e) {
            System.out.println("No se pudo resolver la ecuación: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}
//en mi consola decidi poner las reglas para que el usuario tuviera claro las excepciones que se lanzan si falla o si el numero es incorrecto.

