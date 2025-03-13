package exec_classe_carro;


public class Exec_Classe_Carro {

    public static void main(String[] args) {
        
        Carro a = new Carro();
        
        
        a.marca = "Ford";
        a.modelo = "Fiesta";
        a.cor = "Branco";
        a.combustivel = "Gasolina";
        a.mostrar();
        a.ligar();
        a.acelerar();
        a.frear();
        
        System.out.println("---------------------------------");
        
        Carro b = new Carro();
        
        b.marca = "Mitsubishi";
        b.modelo = "L-200";
        b.cor = "Azul-Royal";
        b.combustivel = "Diesel";
        b.mostrar();
        b.ligar();
        b.acelerar();
        b.frear();
    }
    
}
