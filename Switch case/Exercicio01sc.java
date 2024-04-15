package exercicio01sc;

import java.util.Scanner;

public class Exercicio01sc {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o código: ");
        int codigo = teclado.nextInt();
        
        switch(codigo) {
            case 1:
                System.out.println("1- Alimento não perecível");
                break;
            case 2:
                System.out.println("2- Alimento perecível");
                break;
            case 3:
                System.out.println("3- Alimento perecível");
                break;
            case 4:
                System.out.println("4- Alimento perecível");
                break;
            case 5:
                System.out.println("5- Vestuário");
                break;
            case 6:
                System.out.println("6- Vestuário");
                break;
            case 7:
                System.out.println("7- Higiene Pessoal");
                break;
            case 8:
                System.out.println("8- Limpeza e Utensílio Doméstico");
                break;
            case 9:
                System.out.println("9- Limpeza e Utensílio Doméstico");
                break;
            case 10:
                System.out.println("10- Limpeza e Utensílio Doméstico");
                break;
            case 11:
                System.out.println("11- Limpeza e Utensílio Doméstico");
                break;
            case 12:
                System.out.println("12- Limpeza e Utensílio Doméstico");
                break;
            case 13:
                System.out.println("13- Limpeza e Utensílio Doméstico");
                break;
            case 14:
                System.out.println("14- Limpeza e Utensílio Doméstico");
                break;
            case 15:
                System.out.println("15- Limpeza e Utensílio Doméstico");
                break;
            default:
                System.out.println("Código inválido, tente novamente.");
        }
    }
    
}
