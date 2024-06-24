package exercicio07;

import java.util.Scanner;
        
public class Exercicio07 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva o salário atual: ");
        float salario = teclado.nextFloat();
        System.out.println("Escreva o percentual de reajuste: ");
        float reajuste = teclado.nextFloat();
        
        float reajustee = (salario*reajuste)/100;
        float salario_atual = reajustee + salario;
        
        System.out.println("O novo salário é R$" + salario_atual);
    }
    
}
