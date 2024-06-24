package exercicio04lr;

import java.util.Scanner;

public class Exercicio04lr {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        
        for(int inicio = 1; inicio<=numero; inicio++){
            System.out.println("Número " + inicio);
        }
    }
    
}
