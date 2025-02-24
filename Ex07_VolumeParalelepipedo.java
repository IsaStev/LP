/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex07_VolumeParalelepipedo {
    public static void main (String[] args) {
            
        double largura, altura, comprimento, volume;
        
        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da largura do paralelepipedo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do paralelepipedo: "));
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do comprimento do paralelepipedo: "));
        
        volume = largura * altura * comprimento;
        
        JOptionPane.showMessageDialog(null, ("O valor do volume do paraleleipedo é: " + volume));
        
        
        
    }
}
