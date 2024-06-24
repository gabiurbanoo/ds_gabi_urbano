package atvjoptionwhile;

import javax.swing.JOptionPane;

public class Atvjoptionwhile {

    public static void main(String[] args) {
        
        String input;
        input = JOptionPane.showInputDialog("Digite um número: ");
        int numero = Integer.parseInt(input);
        int inicio = 1;
        
        while(inicio<=numero){
            System.out.println(inicio);
            inicio++;
        }
    }
    
}
 