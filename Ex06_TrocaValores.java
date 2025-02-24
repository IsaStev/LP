/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex06_TrocaValores {
    public static void main (String[] args) {
    
        double x, y, z;
            
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor(X): "));
        y = Double.parseDouble(JOptionPane.showInputDialog ("Digite outro valor(Y): "));
        
        z = x;
        x = y;
        y = z;
        
        JOptionPane.showMessageDialog(null, ("Os valores trocados são: \n X = " + x + "\n Y = " + y));
    } 
}
