package exercicio02a;

import java.util.Scanner;

public class Exercicio02a {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int numero [] = new int [10];
        int menor = 0;   
        int indice = 0;

        System.out.println("Digite o " + indice + " número inteiro: ");
        numero[indice] = teclado.nextInt();
        menor = numero[indice];
        
        indice++;

        while(indice < 10){
            System.out.println("Digite o " + indice + "° número inteiro: ");
            numero[indice] = teclado.nextInt();

            if(menor >= numero[indice]){
                menor = numero[indice]; 
            }

        indice++;
        }

        System.out.println("O menor número digitado: " + menor);

        System.out.println("Digite o número procurado: ");
        int proc = teclado.nextInt();

        indice = 0; 
        while(indice < 10){
            if(proc == numero[indice]){
                proc = indice;

            } 
            indice++;
        }

        System.out.println("O número procurado está no vetor[" + proc + "]");

    }
}