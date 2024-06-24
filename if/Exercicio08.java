package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva o valor do carro: ");
        float carro = teclado.nextFloat();
        
        float distribuidora = (28*100)/carro;
        float imposto = (45*100)/carro;
        float total = carro + distribuidora + imposto;
        
        System.out.println("O valor final do carro é de R$" + total);
    }
    
}
