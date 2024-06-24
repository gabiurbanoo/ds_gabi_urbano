package exercicio07lr;

import java.util.Scanner;

public class Exercicio07lr {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10: ");
        int numero = teclado.nextInt();
        
        for (int inicio = 1; inicio <= 10; inicio++) {
            int resultado = numero * inicio;
            System.out.println(numero + " x " + inicio + " = " + resultado);
        }
    }
    
}
