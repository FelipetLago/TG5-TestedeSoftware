package teste.de.software.tg5.ex2;

/**
 *
 * @author Felipe
 */
public class Exercicio2 {
    public String notaObg(int mtInNota){
        
        String mtOutResp = "";
        
        if (mtInNota < 0 || mtInNota > 10){
            mtOutResp = "Nota Invalida";
        }
        else if (mtInNota > -1 && mtInNota < 11){
            mtOutResp = "Nota Valida";
        }
        
        return mtOutResp;
    }   
}
