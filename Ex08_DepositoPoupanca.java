
/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex08_DepositoPoupanca {
    public static void main (String[] args) {
        
        double deposito, reajuste;
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: "));
        
        reajuste = deposito * 1.3;
        
        JOptionPane.showMessageDialog(null, "O valor do salário reajustado é: " + reajuste);
        
    }
}
