/** Receba 4 notas de um aluno, calcule a média aritimetica e mostre a mensagem de acordo com a média
 * 
 *
 * @author Isabela PC
 */

import javax.swing.JOptionPane;
public class Ex21_NotasAluno {
    public static void main (String[] args){
        
        double n1, n2, n3, n4, media;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a segunda nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a terceira nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a quarta nota : "));
        
        media = (n1 + n2 + n3 + n4) / 4;
        
        if (media >= 6.0){
           JOptionPane.showMessageDialog(null, ("APROVADO!"));
        }
        else {
            if (media >= 3.0 && media < 6.0){
                JOptionPane.showMessageDialog(null, ("EXAME!"));
            }
            else {
                if (media < 3) {
                    JOptionPane.showMessageDialog(null, ("RETIDO!"));
                }
            }
        }
    }
}
