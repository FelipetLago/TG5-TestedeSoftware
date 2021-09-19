package teste.de.software.tg5.ex3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */

//Print na WIKI

public class Exercicio3Test {
    Exercicio3 idadeRenova;
    
    public Exercicio3Test() {
        idadeRenova = new Exercicio3();
    }

    @Test
    public void testIdadeMotoInfer50() {
        System.out.println("Teste Idade Inferior 50");
        
        assertEquals("Renovacao a cada 10 anos", idadeRenova.idadeMoto(50));
        assertEquals("Renovacao a cada 10 anos", idadeRenova.idadeMoto(49));
    }
    
    @Test
    public void testIdadeMotoEntre50e70() {
        System.out.println("Teste Idade entre 50 e 70");
        
        assertEquals("Renovacao a cada 5 anos", idadeRenova.idadeMoto(51));
        assertEquals("Renovacao a cada 5 anos", idadeRenova.idadeMoto(69));
    }
    
    @Test
    public void testIdadeMotoIgualSup70() {
        System.out.println("Teste Idade igual ou superior a 70");
        
        assertEquals("Renovacao a cada 3 anos", idadeRenova.idadeMoto(70));
        assertEquals("Renovacao a cada 3 anos", idadeRenova.idadeMoto(71));
    }
    
}
