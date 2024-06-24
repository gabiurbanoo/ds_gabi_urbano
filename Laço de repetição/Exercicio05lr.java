package exercicio05lr;

import java.util.Scanner;

public class Exercicio05lr {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        
        if (numero<=0){
            System.out.println("Seu número precisa ser maior que 0");
        }
        else{
            for(int inicio = 1; inicio<=numero; inicio++){
                System.out.println("Número " + inicio);
            }
        }
    }
    
}
