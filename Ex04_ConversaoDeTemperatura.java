/*
 *
 * @author FATEC ZONA LESTE
 */

import javax.swing.JOptionPane;
public class Ex04_ConversaoDeTemperatura {
    public static void main (String [] args) {
    
        //declara
        double celsius, fahrenheit;
        
        //solicita entrada de dados
        celsius = Double.parseDouble(JOptionPane.showInputDialog ("Digite a temperatura em Celsius para conversão"));
       
       //operacaao
       fahrenheit = 9 * celsius + 160 /5;
       
       // mostra resultado
       JOptionPane. showMessageDialog(null, ("O valor da temperatura convertida é :" + fahrenheit));
      
    }
    
}
