/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex09_SomaDosQuadrados {
    public static void main(String[] args){
    
        int a, b, somaA, somaB, somaAB;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        somaA = a * a;
        somaB = b * b;
        somaAB = somaA + somaB;
        
        JOptionPane.showMessageDialog(null,"A soma dos quadrado dos dois números é: " + somaAB);
     
    }
}
