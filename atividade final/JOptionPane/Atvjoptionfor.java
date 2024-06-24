package atvjoptionfor;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Atvjoptionfor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int soma = 0;
        int numero;
        
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número: ");
            numero = teclado.nextInt();
            soma += numero;
        }
        
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
    }
    
}

