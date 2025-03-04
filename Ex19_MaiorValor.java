/**Receba 2 valores reais. Calcule e mostre o maior deles.
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex19_MaiorValor {
    public static void main (String[]args){
        
        double v1, v2, maior;
        
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        if (v1 > v2) {
            maior = v1;
            JOptionPane.showMessageDialog(null, "O valor maior é: " + maior);           
        }
        else {
            if (v1 < v2) {
                maior = v2;
                JOptionPane.showMessageDialog(null, "O valor maior é: " + maior);
            }
            else {
                if (v1 == v2) {
                    JOptionPane.showMessageDialog(null, "Os valores são iguais");      
                }
            }
        }
    }
}
