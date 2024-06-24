package exercicio04w;

import java.util.Scanner;

public class Exercicio04w {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos: ");
        int alunos = teclado.nextInt();
        
        int inicio = 1;
        double soma = 0;
        
        while(inicio<=alunos){
            System.out.println("Qual a nota do " + inicio + "º aluno?");
            double nota = teclado.nextDouble();
            soma += nota;
            inicio++;
        }
        
        double media = (double) soma/alunos;
        System.out.println(media);
    }
    
}
