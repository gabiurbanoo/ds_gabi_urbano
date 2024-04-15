package exercicio03;

import java.util.Scanner

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a distância da viagem (em KM): ");
        float distancia = teclado.nextFloat();
        System.out.println("Digite a quantidade de KM/L que seu carro faz: ");
        float kml = teclado.nextFloat();
        System.out.println("Digite o preço da gasolina: ");
        float preco = teclado.nextFloat();
        
        float resultado = distancia/kml*preco;
        
        System.out.println("O custo será de R$" + resultado);
        
    }
    
}
