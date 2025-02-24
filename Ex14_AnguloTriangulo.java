/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex14_AnguloTriangulo {
    public static void main (String [] args){
    
        double ang1, ang2, ang3;
        
        ang1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro angulo"));
        ang2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo angulo"));
        
        ang3 = 180 - (ang1 + ang2);
        
        JOptionPane.showMessageDialog(null, "O valor no terciero angulo é: " + ang3);
    }
    
}
