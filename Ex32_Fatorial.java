/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex32_Fatorial {
    public static void main (String [] args) {
        
        int n1, i;
        int fatorial = 1;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número para calcularmos seu fatorial"));
        
        if (n1 < 0) {
            JOptionPane.showMessageDialog(null, ("Não é possivel calcular fatorial de um número negativo"));
        }
        else {
        
            for(i = n1 ; i > 0 ; i--) {
                fatorial = fatorial * i;
            }
            JOptionPane.showMessageDialog(null, ("O fatorial de: " + n1 + "é: " + fatorial));
        }    
    }
}