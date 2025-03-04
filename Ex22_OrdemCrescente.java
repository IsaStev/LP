/** Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 *
 * @author Isabela PC
 */

import javax.swing.JOptionPane;
public class Ex22_OrdemCrescente{
    public static void main (String [] args){

        int v1, v2, maior, menor;

        v1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor um número: "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite outro número diferente: "));

        if (v1 > v2) {
            maior = v1;
            menor = v2;

            JOptionPane.showMessageDialog(null, ("Os números em ordem crescente: " + maior + " , " + menor));

        }
        else if (v2 > v1 ) {
                maior = v2;
                menor = v1;

                JOptionPane.showMessageDialog(null, ("Os valores em ordem crescente: " + maior + " , " + menor));
        }
            else {
                JOptionPane.showMessageDialog(null, ("Os números são iguais!"));
            }
    }
}