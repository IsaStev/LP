/**
 *Receba um número e verifique se é divisivel por 2 e 3
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex24_Divisivel2e3 {
    public static void main (String[] args) {

        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número pra ver se é divisível por 2 e/ou por 3."));

        if (n1 % 2 == 0 && n1 % 3 == 0) {
            JOptionPane.showMessageDialog(null, ("O número é divisível por 2 e 3."));
        }
        else if (n1 % 2 == 0) {
                JOptionPane.showMessageDialog(null, ("O número é divisível apenas por 2."));
        }
            else if (n1 % 3 == 0) {
                    JOptionPane.showMessageDialog(null, ("O número é divisível apenas por 3."));
            }
                else{
                    JOptionPane.showMessageDialog(null, ("O número não é divisível nem por 2 nem por 3."));
                }
    }
}
