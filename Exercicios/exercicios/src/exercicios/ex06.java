package exercicios;

import java.util.Scanner;

public class ex06 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int soma = 0;

        while (numero < 10) {
            
            System.out.println("Digite um número: ");
            soma += scan.nextInt();
            numero++;
            
        }
        System.out.println("O resultado final é: " + soma);
    }   
}
