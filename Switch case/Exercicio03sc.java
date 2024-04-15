package exercicio03sc;

import java.util.Scanner

public class Exercicio03sc {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o código: ");
        int codigo = teclado.nextInt();
        
        switch(codigo){
            case 100:
                System.out.println("Digite a quantidade de cachorros quentes comprados: ");
                int quantcq = teclado.nextInt();
                float precocq = (float) (quantcq * 1.70);
                System.out.println("O valor total de cachorros quentes é R$" + precocq);
                break;
            case 101:
                System.out.println("Digite a quantidade de baurus simples comprados: ");
                int quantbs = teclado.nextInt();
                float precobs = (float) (2.30 * quantbs);
                System.out.println("O valor total de baurus simples é R$" + precobs);
                break;
            case 102:
                System.out.println("Digite a quantidade de baurus com ovo comprados: ");
                int quantbo = teclado.nextInt();
                float precobo = (float) (quantbo * 2.60);
                System.out.println("O valor total de baurus com ovo é R$" + precobo);
                break;
            case 103:
                System.out.println("Digite a quantidade de hambúrgueres comprados: ");
                int quanth = teclado.nextInt();
                float precoh = (float) (quanth * 2.40);
                System.out.println("O valor total de hambúrgueres é R$" + precoh);
                break;
            case 104:
                System.out.println("Digite a quantidade de cheeseburgueres comprados: ");
                int quantc = teclado.nextInt();
                float precoc = (float) (quantc * 2.50);
                System.out.println("O valor total de cheeseburgueres é R$" + precoc);
                break;
            case 105:
                System.out.println("Digite a quantidade de refrigerantes comprados: ");
                int quantr = teclado.nextInt();
                float precor = (float) (quantr * 1.00);
                System.out.println("O valor total de refrigerantes é R$" + precor);
                break;
            default:
                System.out.println("Código inválido. Tente novamente");
        }
    }
    
}
