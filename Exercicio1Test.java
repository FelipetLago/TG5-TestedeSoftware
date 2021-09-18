package teste.de.software.tg5.ex1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */
public class Exercico1Test {
    
    Exercico1 anos;
    
    public Exercico1Test() {
        anos = new Exercico1();
        
    }
    
    @Test
    public void testAnoObgInvalido() {
        System.out.println("Teste Ano Invalido");
        
        assertEquals("Ano Invalido", anos.anoObg(1889));
        assertEquals("Ano Invalido", anos.anoObg(2021));
    }
    
    @Test
    public void testAnoObgValido() {
        System.out.println("Teste Ano VALIDO");
        
        assertEquals("Ano Valido", anos.anoObg(1900));
        assertEquals("Ano Valido", anos.anoObg(2020));
        assertEquals("Ano Valido", anos.anoObg(2019));
        assertEquals("Ano Valido", anos.anoObg(1901));
    }
    
}
