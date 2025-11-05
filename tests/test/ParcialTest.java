package test;

import logica.Parcial;
import logica.CoeficienteInvalidoException;
import logica.SinRaicesRealesException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.*;

public class ParcialTest {

    @Test
    public void testRaicesNormales() throws Exception {
        Parcial p = new Parcial();
        double[] r = p.resolverCuadratica(1, -3, 2);
        assertEquals(2.0, r[0]);
        assertEquals(1.0, r[1]);
    }

    @Test
    public void testCoeficienteInvalido() {
        Parcial p = new Parcial();

        Executable ejecutar = new Executable() {
            public void execute() throws Throwable {
                p.resolverCuadratica(0, 2, 3);
            }
        };

        assertThrows(CoeficienteInvalidoException.class, ejecutar);
    }

    @Test
    public void testSinRaicesReales() {
        Parcial p = new Parcial();

        Executable ejecutar = new Executable() {
            public void execute() throws Throwable {
                p.resolverCuadratica(1, 2, 5);
            }
        };

        assertThrows(SinRaicesRealesException.class, ejecutar);
    }
}

