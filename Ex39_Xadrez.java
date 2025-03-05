
/**
 *
 * @author Isabela PC
 */

public class Ex39_Xadrez {
    public static void maisn(String[] args){
        
        long total, graos;
        int i;
        
        total = 0;
        graos = 1;
        
        for(i=1 ; i<=64 ; i++ ){
            //Soma os graos na casa atual
            total = total + graos;
            //Dobra os graos para a proxima casa
            graos = graos * 2;
        }
        System.out.println("O total de grãos no tabuleiro: " + total);
    }  
}