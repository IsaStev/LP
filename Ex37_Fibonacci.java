/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex37_Fibonacci {
    public static void main (String[] args) {
        
        int num , i, proximo, anterior, atual;
        
        num = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número para calcular a serie de Fibonacci"));
        
        anterior = 0;
        atual = num;
        
        //System.out.print(num + " ");
        
        for(i=1 ; i <= num ; i++){
            proximo = anterior + atual;
            System.out.print(proximo + " ");
            anterior = atual;
            atual = proximo;            
        }
    }
}