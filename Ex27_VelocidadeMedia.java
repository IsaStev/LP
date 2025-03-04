/** Receba o número de voltas, a extensão do circuito em metros e o tempo de duração em minutos. Calcule e mostre a velocidade media em km/h
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;

public class Ex27_VelocidadeMedia {
    public static void main (String [] args){
        
        double voltas, extensao, tempo, total, vm;
        
        extensao = Double.parseDouble(JOptionPane.showInputDialog ("Qual a extensao da pista em metros?"));
        voltas = Double.parseDouble(JOptionPane.showInputDialog ("Quantas voltas tem o circuito?"));
        tempo = Double.parseDouble(JOptionPane.showInputDialog ("Qual o tempo total do circuito em minutos?"));
        
        // converte metro para quilometro 
        total = (extensao * voltas) / 1000;
        // converte minuto em horas
        tempo = tempo / 60;
        
        vm = total / tempo;
        
        JOptionPane.showMessageDialog (null, ("A velocidade média desse circuito foi: " + vm + "km/h"));
        
    }
}