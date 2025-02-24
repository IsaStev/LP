/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex17_VelocidadeMedia {
    public static void main(String[]args) {
    
        double tempo, velocidade, distancia, litrosGastos;
        
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de viagem m horas: "));
        velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da velocidade media"));
        
        distancia = tempo * velocidade;
        litrosGastos = distancia / 12;
        
        JOptionPane.showMessageDialog(null,"Distancia percorrida: " + distancia + "km\n" + " Combustivel gasto: " + litrosGastos);
  }
}
