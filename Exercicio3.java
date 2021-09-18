package teste.de.software.tg5.ex3;

/**
 *
 * @author Felipe
 */
public class Exercicio3 {
    public String idadeMoto(int mtInIdade){
        
        String mtOutRenova = "";
        
        if (mtInIdade <= 50){
            mtOutRenova = "Renovacao a cada 10 anos";
        }
        
        else if (mtInIdade >= 51 && mtInIdade < 70){
            mtOutRenova = "Renovacao a cada 5 anos";
        }
        
        else if (mtInIdade >= 70){
            mtOutRenova = "Renovacao a cada 3 anos";
        }

        return mtOutRenova;
    }   
}
