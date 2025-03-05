/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex34_Tabuada {
    public static void main (String [] args) {
        
        int i, num, tabuada;
        
        num = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor para calcularmos sua tabuada."));
        
        System.out.println ("Tabuada do: " + num); 
        
        for(i = 1 ; i <=10 ; i ++) {
            tabuada = num * i;
            System.out.println ( num + " * " + i + " = " + tabuada);
        
        }
    }
}