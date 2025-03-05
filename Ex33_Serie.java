/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex33_Serie {
    public static void main(String[] args){
    
        int i, j, n1;
        double resultado=0, fatorial;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número"));
        
        // calcula a serie
        for (i = 1 ; i <= n1 ; i ++){
            fatorial = 1;
            
            for ( j = 1 ; j <= i ; j++) {
                fatorial = fatorial * j;
            }
            
            resultado = resultado + (1.0 / fatorial);
            System.out.println("1/" + i + " ! = "  + (1.0 / fatorial));
        }
        JOptionPane.showMessageDialog(null, "O resultado da serie é: " + resultado);
    } 
}