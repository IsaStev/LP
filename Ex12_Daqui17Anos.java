/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex12_Daqui17Anos {
    public static void main (String[] args) {
    
        double anoNascimento, anoAtual, idade, daqui17;
        
        anoNascimento = Double.parseDouble(JOptionPane.showInputDialog("Digi o ano do seu nascimento: "));
        anoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano atual: "));
        
        idade = anoAtual - anoNascimento;
        daqui17 = idade + 17;
        
        JOptionPane.showMessageDialog(null, ("A sua idade é: " + idade + "\n Sua idade daqui 17 anos será: " + daqui17)); 
        
    }
}
