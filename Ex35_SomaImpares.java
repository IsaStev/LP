/**
 *
 * @author Isabela PC
 */

import javax.swing.JOptionPane;
public class Ex35_SomaImpares {
    public static void main (String[] args){
    
    int num1, num2, maior, menor, i, soma;
    
    num1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o primeiro número"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o segundo número"));
    
    //Inicializa variaveis.
    maior = 0;
    menor = 0;
    soma = 0;
    
    //Verifica maior e menor.
    if (num1 == num2) {
        JOptionPane.showMessageDialog (null, "Os números são iguais.");
        return;
    }
    else{
            
        if (num1 > num2) {
            maior = num1;
            menor = num2;  
        }
        else{
            if(num2> num1) {
                maior = num2;
                menor = num1;
            }
        }
    }
   
        //Looping para somar os impares.
        for (i = menor ; i <= maior ; i ++){
            if (i % 2 != 0){
                soma = soma + i;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A soma dos números impares entre " + menor + " e " + maior + " é: " + soma);
    }
}