/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex36_SerieFatorial {
    public static void ain (String[] args){
        int i, n1;
        double resultado;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número"));
        
        for (i = 1 ; i <= n1 ; i ++){
            
            resultado = 1.0/i;
            System.out.print("1/" + i + " = "  + resultado + "\n");
        }
        
    }
    
}
