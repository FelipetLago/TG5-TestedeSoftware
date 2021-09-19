package teste.de.software.tg5.ex2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */

//Print na WIKI

public class Exercicio2Test {
    Exercicio2 notas;
    
    public Exercicio2Test() {
        notas = new Exercicio2();
    }

    @Test
    public void testNotaObgInvalido() {
        System.out.println("Teste Nota Invalida");
        
        assertEquals("Nota Invalida", notas.notaObg(-1));
        assertEquals("Nota Invalida", notas.notaObg(11));
    }
    
    @Test
    public void testNotaObgValido() {
        System.out.println("Teste Nota VALIDA");
        
        assertEquals("Nota Valida", notas.notaObg(0));
        assertEquals("Nota Valida", notas.notaObg(10));
        assertEquals("Nota Valida", notas.notaObg(5));
        assertEquals("Nota Valida", notas.notaObg(1));
        assertEquals("Nota Valida", notas.notaObg(9));
    }
    
}
