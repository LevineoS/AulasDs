package exercicios;

import java.util.Scanner;

public class ex05 {
    
    public static void main(String[] args) {
      
    Scanner scan = new Scanner(System.in);
        
    int segredo = 19;
    int chute;

    do {

        System.out.println("De um número de 1 a 20, faça um chute de qual seria ele: ");
        chute = scan.nextInt();
        System.out.println("Número incorreto, tente novamente; ");
        chute = scan.nextInt();

    }while(chute != segredo);

        System.out.println("Você acertou o número!");

    }
}
