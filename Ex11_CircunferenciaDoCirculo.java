/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex11_CircunferenciaDoCirculo {
    public static void main(String[] args){
    
        double raio,comprimento;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio da circunferencia: "));
        comprimento = 2 * 3.14 * raio;
        
        JOptionPane.showMessageDialog(null,"O valor do comprimento é: " + comprimento);

    }
    
}
