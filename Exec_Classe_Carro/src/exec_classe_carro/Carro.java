package exec_classe_carro;

public class Carro {
    
    String marca;
    String modelo;
    String cor;
    String combustivel;
    
    void mostrar(){
        System.out.println("A marca do seu carro: " + marca + "\n" + "O modelo: " + modelo + "\n" + "A cor: " + cor + "\n" + "O tipo de combustivel usado: " + combustivel);
        
    }
   
    void ligar(){
        System.out.println("Carro Ligando");
        System.out.println("-------------");
    }
    
    void acelerar(){
        System.out.println("Carro Acelerando");
        System.out.println("-------------");
    }
    
    void frear(){
        System.out.println("Carro freando");
        System.out.println("-------------");
    }
    
}
