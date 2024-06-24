package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite seu sexo (F para feminino ou M para masculino): ");
        String sexo = teclado.nextLine();
        System.out.println("Digite sua altura: ");
        float altura = teclado.nextFloat();
        
        if (sexo.equalsIgnoreCase("F"))
        {
            double peso = (62.1*altura) - 44.7;
            System.out.println("O peso ideal de " + nome + "é de " + peso);
        }
        else if (sexo.equalsIgnoreCase("M"))
        {
            double peso = (float) ((72.7*altura) - 58);
            System.out.println("O peso ideal é " + nome + "é de " + peso);
        }
    }
}
