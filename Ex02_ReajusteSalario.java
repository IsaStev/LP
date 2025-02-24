/* Receba o salário de um funcionário e mostre o novo salário com reajuste 
de 15%
 *
 * @author FATEC ZONA LESTE
 */

import javax.swing.JOptionPane;

public class Ex02_ReajusteSalario {
    public static void main (String [] args) {
        
        //declara variavel como double
        double salario, reajuste, reajustado;
                
        // solicita entrada de dados 
        salario = Double.parseDouble(JOptionPane.showInputDialog ("Digite o valor do salário que será reajustado"));
        
        //operação
        reajuste = salario * 0.15;
        reajustado =  reajuste + salario;
        
        //exibe caixa de mensagem
        JOptionPane.showMessageDialog(null, "O salário reajustado é: " + reajustado);
    
    }
    
}
