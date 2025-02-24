/*
 *Coletar o valor do lado de um quadrado, calcular sua área e apresentar o 
resultado
 * @author FATEC ZONA LESTE
 */

import javax.swing.JOptionPane;
        
public class Ex01_AreaQuadrado {
    public static void main (String [] args) {
        
        //declara as duas veriaveis como double
        double area, lado;
        
        // solicita a entrada de dados com janela de dialogo
        lado = Double.parseDouble(JOptionPane.showInputDialog ("Digite o lado do quadrado: "));
        
        // operação
        area = lado * lado;
        
        // mostra o resultado da operaçao em uma caixa de mensagem
        JOptionPane.showMessageDialog(null, "A área do quadrado é " + area);
        
    }
}      

