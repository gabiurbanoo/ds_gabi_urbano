package exercicio04a;

import java.util.Scanner;

public class Exercicio04a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int maior, menor;

        System.out.println("Insira os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        maior = matriz[0][0];
        menor = matriz[0][0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }


        System.out.println("O maior valor na matriz é: " + maior);
        System.out.println("O menor valor na matriz é: " + menor);
        }
        
    }
