/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex15_Hipotenusa {
    public static void main(String[] args) {
    
        double cat1, cat2, hipotenusa;
        
        cat1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro cateto: "));
        cat2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo cateto: "));
        
        hipotenusa = Math.sqrt((cat1 * cat1) + (cat2* cat2));
        
        JOptionPane.showMessageDialog(null,"O valor da hipotenusa é: " + hipotenusa);
    }
}
