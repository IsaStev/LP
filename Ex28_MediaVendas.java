/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex28_MediaVendas {
    public static void main (String [] args) {
        
        double precoAtual, mediaVendas, novoPreco;
        
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog ("Qual o preço atual do produto?"));
        mediaVendas = Double.parseDouble(JOptionPane.showInputDialog ("Qual a media mensal de vendas desse produto?"));
        
        if (mediaVendas < 500 && precoAtual < 30) {
            novoPreco = precoAtual + (precoAtual * 0.10); //aumenta 10%
        }
        else if (mediaVendas >= 500 && mediaVendas < 1000 && precoAtual >=30 && precoAtual <80) {
                novoPreco = precoAtual + (precoAtual * 0.15); // aumenta 15%
        }
            else if (mediaVendas >= 1000 && precoAtual >= 80) {
                    novoPreco = precoAtual - (precoAtual * 0.05); // treduz 5%
            }
                else{
                    novoPreco = precoAtual;
                } 
    JOptionPane.showMessageDialog (null, ("O novo preço do produto deve ser: " + novoPreco));
    }
}