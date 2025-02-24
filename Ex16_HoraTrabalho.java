/**
 *
 * @author Isabela PC
 */
import javax.swing.JOptionPane;
public class Ex16_HoraTrabalho {
    public static void main (String[] args){
        
        double HorasTrab, PorHora, SalarioBruto, Desconto, SalarioLiquido;
        int Percentual, Dependentes, Adicional;
        
        HorasTrab = Double.parseDouble(JOptionPane.showInputDialog("Digite quantidade de horas trabalhadas: "));
        PorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite ovalor recebido por hora: "));
        Percentual = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
        Dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependetes: "));
        
        SalarioBruto = HorasTrab * PorHora;
        
        Desconto = (Percentual / 100) * SalarioBruto;
        Adicional = Dependentes * 100;
        SalarioLiquido = SalarioBruto - Desconto + Adicional;
        
        JOptionPane.showMessageDialog(null, "O valor total do salario liquido é: " + SalarioLiquido);
    
    }
    
}
