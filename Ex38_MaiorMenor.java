/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex38_MaiorMenor {
    public static void main(String[] args){
        
        int i, n, maior, menor;
        
        n = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número"));
        maior = n;
        menor = n;
        
        for(i=1 ; i <=99 ; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número"));
            
            if(n > maior){
                maior = n;
            }
            else {
                if(n < menor) {
                    menor = n;
                }
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
    }
    
}
