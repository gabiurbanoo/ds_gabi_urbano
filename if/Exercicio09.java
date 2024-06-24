package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu salário: ");
        float salario = teclado.nextFloat();
        System.out.println("Digite o valor da sua comissão: ");
        float comissao = teclado.nextFloat();
        System.out.println("Digite quantos carros você vendeu esse mês: ");
        float quantcarros = teclado.nextFloat();
        System.out.println("Digite o valor que você vendeu esse mês: ");
        float valorcarros = teclado.nextFloat();
        
        float calculo_carro = (5*valorcarros)/100;
        float valorcomissao = comissao * quantcarros;
        float total = salario + valorcomissao + calculo_carro;
        
        System.out.println("O salário final é de R$" + total);
    }
    
}
