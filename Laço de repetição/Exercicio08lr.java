package exercicio08lr;

import java.util.Scanner;

public class Exercicio08lr {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor de n (número de termos da série de Fibonacci): ");
        int numero = teclado.nextInt();
        
        int primeiro = 1;
        int segundo = 1;

        System.out.println("Série de Fibonacci até o " + numero + "º termo:");
        System.out.print(primeiro + " " + segundo + " ");

        for (int i = 3; i <= numero; i++) {
            int proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }
    }
    
}
