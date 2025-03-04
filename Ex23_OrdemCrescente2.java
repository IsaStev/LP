/**Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex23_OrdemCrescente2 {
    public static void main (String[] args) {

        int v1, v2, v3, v4;
        int o1, o2, o3, o4;

        v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número (maior que o primeiro)"));
        v3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número (maior que o segundo)"));

        if (v1 > v2 || v2 > v3) {
            JOptionPane.showMessageDialog(null , ("Os tres numero não foram digitados em ordem crescente."));
            return;
        }
        else {
            v4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número."));

            if (v4 <= v1) {
                o1 = v4;
                o2 = v1;
                o3 = v2;
                o4 = v3;
            }
            else {
                if (v4 <= v2) {
                    o1 = v1;
                    o2 = v4;
                    o3 = v2;
                    o4 = v3;
                }
                else {
                    if  (v4 <= v3) {
                        o1 = v1;
                        o2 = v2;
                        o3 = v4;
                        o4 = v3;
                    }
                    else {
                        o1 = v1;
                        o2 = v2;
                        o3 = v3;
                        o4 = v4;
                    }
                }
            }        
        }
        JOptionPane.showInputDialog(null,("Os números na oredem crescente: \n" + o1 + ", " + o2 + ", " + o3 + ", " + o4));
    }
}
