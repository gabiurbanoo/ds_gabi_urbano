package atvjoptionif;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Atvjoptionif {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número entre 1 e 10: ");
        int numero = teclado.nextInt();
        
        if(numero<=10){
            JOptionPane.showMessageDialog(null, "Seu número é " + numero);
        }
        else{
            JOptionPane.showMessageDialog(null, "Número inválido, tente novamente");
        }
    }
    
}
