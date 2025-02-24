/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex13_ConsumoAlimentos {
    public static void main(String[] args){
    
        double alimentos, gramas;
        int dias;
        
        alimentos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento em kilos"));
        gramas = alimentos * 1000;
        dias = (int) gramas / 50;
                
        JOptionPane.showMessageDialog(null,"O alimento durará: " + dias);
    }
    
}
