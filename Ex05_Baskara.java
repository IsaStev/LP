
/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex05_Baskara {
    public static void main(String[] args) {
        
        int a, b, c;
        double delta, x1, x2;
   
        a = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de C: "));
        
        delta = (b * b) - 4 * a *c;
        
        x1 = (-b + Math.sqrt(delta)) / (2*a);
        x2 = (-b - Math.sqrt(delta)) / (2*a);
        
        JOptionPane.showMessageDialog(null, ("O valor de X é: " + x1 + "\nO valor de x2 é: " + x2 + "\nO valor de delta é: " + delta));
    }
}
