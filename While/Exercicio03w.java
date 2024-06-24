package exercicio03w;

import java.util.Scanner;

public class Exercicio03w {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        
        System.out.println("Números pares:");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        System.out.println("Números ímpares:");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}