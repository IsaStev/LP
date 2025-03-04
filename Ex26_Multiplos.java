/** Receba 2 números inteiros, verifique e mostre se o maior pe multiplo do menor.
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex26_Multiplos {
    public static void main (String[] args){
        
        int n1, n2, maior, menor;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um primeiro valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor: "));
        
        //elimina se os números forem iguais.
        if (n1 == n2 ){
            JOptionPane.showMessageDialog(null, ("Os números são iguais e não podem ser múltiplos um do outro."));
            return;
        }
        
            if (n1 > n2) {
                maior = n1;
                menor = n2;
            }   
            else{
                maior = n2;
                menor = n1;
            }
        
                if (maior % menor == 0) {
                    JOptionPane.showMessageDialog(null, (maior + " é multiplo de " + menor + "."));    
                }
                else {
                    JOptionPane.showMessageDialog(null, (maior + " não é multiplo de " + menor + "."));
                }       
    }  
}
