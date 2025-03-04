/**eceba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula 
*AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso 
*exista, calcule e mostre.
 * @author Isabela PC
 */

import javax.swing.JOptionPane;
public class Ex20_Baskara {
    public static void main (String[] args) {

        int a, b, c;
        double x1, x2, delta;

        a = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog ("Digite o vAlor de B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de C: "));

        //verifica se A é igual a zero
        if (a==0){
            JOptionPane.showMessageDialog(null, ("O valor de a é igual a zero, então não pode ser uma equação de segundo grau!"));
        }
        else {
            //Cálculo Delta
            delta = (b*b) - 4*a*c;

            //Verifica raizes reais
            if (delta > 0){
                x1 = (-b + Math.sqrt(delta)) / (2*a);
                x2 = (-b - Math.sqrt(delta)) / (2*a);
                JOptionPane.showMessageDialog(null, "A equação possui duas raizes. \n x1 = " + x1 + "\n x2 = " + x2);
            
            }
            else {
                if (delta == 0) {
                    x1 = -b / (2*a);
                    JOptionPane.showInputDialog(null, "A equação possui uma raiz única: \n x= " + x1);
            
                }
                else {
                    JOptionPane.showInputDialog(null, "A euqação não possui raizes reais.");
                }    
            }
        }
    }
}
