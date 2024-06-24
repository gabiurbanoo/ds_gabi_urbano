package exercicio07w;

import java.util.Scanner;

public class Exercicio07w {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int tamanho = teclado.nextInt();
        
        int i = 0;
        while (i < tamanho){
            int j = 0;
            while (j < tamanho){
                System.out.print("*");
                j++;
            }
            
            System.out.println();
            i++;
        }
    }
    
}
    