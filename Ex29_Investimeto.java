/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex29_Investimeto {
    public static void main(String[]args) {
        
        double aplicado, corrigido;
        int tipo;
        
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo do seu investimento? \n 1- Poupança     2-Renda Fixa"));
        
        if (tipo != 1 && tipo != 2) {
                JOptionPane.showMessageDialog(null, ("Tipo de investimento inválido.")); 
                return;
        }
        
        aplicado = Double.parseDouble(JOptionPane.showInputDialog ("Qual o valor do investimento que será feito?"));
        
        if (tipo == 1) {
            corrigido = aplicado + (aplicado * 0.03);
            JOptionPane.showMessageDialog(null, ("O valor do investimeno após um mês será de: " + corrigido));
        }
        else {
            if (tipo == 2){
                corrigido = aplicado + (aplicado * 0.05);
                JOptionPane.showMessageDialog(null, ("O valor do investimento após um mês será de: " + corrigido));
            }
        }
    }
}
