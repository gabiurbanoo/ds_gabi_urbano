package exercicio05w;

import java.util.Scanner;

public class Exercicio05w {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int inicio = 1;
        int maior = Integer.MIN_VALUE;
        
        while(inicio<=10){
            System.out.println("Digite um número: ");
            int numero = teclado.nextInt();
            
            if(numero>maior){
                maior = numero;
            }
            inicio ++;
        }
        
        System.out.println("O maior número digitado foi: " + maior);
    }
    
    
    
}
