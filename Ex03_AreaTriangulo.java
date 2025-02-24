/*Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 *
 * @author FATEC ZONA LESTE
 */

import javax.swing.JOptionPane;
        
public class Ex03_AreaTriangulo {
    public static void main (String [] args){
    
        //dclara
        double base, altura, area ; 
        
        //solicita entrada de dados
        base = Double.parseDouble (JOptionPane.showInputDialog ("Digite o valor da base do triangulo"));
        altura = Double.parseDouble (JOptionPane.showInputDialog("Digite o valor da altura do triangulo"));
        
        //operacao
        area = base * altura;
        area = area / 2;
        
        //exibe caixa de mensagem
        JOptionPane. showMessageDialog(null, ("o valor da area é de: " + area));
                
    }
    
}
