package exercicio06w;

import java.util.Scanner;

public class Exercicio06w {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int inicio = 1;
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;
        
        while(inicio<=5){
            System.out.println("Digite um número: ");
            int numero = teclado.nextInt();
            
            if(numero>maior){
                segundoMaior = maior;
                maior = numero;
            }
            else if(numero>segundoMaior){
                segundoMaior = numero;
            }
            inicio ++;
        }
        
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O segundo maior número foi: " + segundoMaior);
    }
    
    
    
}
