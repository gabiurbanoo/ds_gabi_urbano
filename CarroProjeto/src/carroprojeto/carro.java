
package carroprojeto;


public class carro {
      
    int vel;
    int ano;
    String nome;
    String marca;
    
    void acel(int aceleração) {
        vel+=aceleração;
    }
    
    void frear(int freio) {
        vel-=freio;
    }
    void buzina() {
        System.out.println("FonFon");
    }
}
