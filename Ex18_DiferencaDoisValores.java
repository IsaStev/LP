/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex18_DiferencaDoisValores {
    public static void main (String[]args){
    
        int n1, n2, maior, menor, diferenca;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o segundo numero"));
        
        if ( n1 == n2){
            JOptionPane.showMessageDialog(null, "Os valores são iguais.");
        }
            else {
                    if (n1 > n2) {
                        maior = n1;
                        menor = n2;
                    } 
                    
                        else {
                            maior = n2;
                            menor = n1;
                        }
                            diferenca = maior - menor;
                            JOptionPane.showMessageDialog(null, "A diferença entre os números é: " + diferenca);
            }
    }  
}
