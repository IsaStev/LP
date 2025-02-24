
/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex10_DiferençaEntreValores {
    public static void main (String[] args) {
    
        double n1, n2, n3;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog ("Digite o valor do seguno número: "));
        n3 = n1 - n2;
        
        JOptionPane.showMessageDialog(null,("O valor da diferença entre os dois números é " + n3 ));
        
       
    }
}
