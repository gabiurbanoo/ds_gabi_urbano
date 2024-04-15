package exercicio02sc;

import java.util.Scanner;

public class Exercicio02sc {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float numero1 = teclado.nextFloat();
        System.out.println("Digite o segundo número: ");
        float numero2 = teclado.nextFloat();
        System.out.println("Digite o código: ");
        int codigo = teclado.nextInt();
        
        switch(codigo) {
            case 1:
                float media = (numero1+numero2)/2;
                System.out.println("A média é " + media);
                break;
            case 2:
                float diferenca = numero1 - numero2;
                System.out.println("A diferença é " + diferenca);
                break;
            case 3:
                float produto = numero1 * numero2;
                System.out.println("O produto é " + produto);
                break;
            case 4:
                float divisao= numero1/numero2;
                System.out.println("A divisão é " + divisao);
                break;
            default:
                System.out.println("Código inválido, tente novamente.");
    }
    
}
