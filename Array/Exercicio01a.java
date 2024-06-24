package exercicio01a;

import java.util.Scanner;

public class Exercicio01a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] vetor = new int[10];
        int menor;

        
        System.out.println("Insira 10 valores inteiros:");
        
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = teclado.nextInt();
        }

        menor = vetor[0];

        for (int i = 1; i < vetor.length; i++){
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O menor valor é: " + menor);
    } 
    
}