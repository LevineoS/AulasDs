package exercicios;

import java.util.Scanner;

public class ex02 {
    
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int numero = 0;
    int soma = 0;

do{

    System.out.println("Digite valores: (Pressione 0 para cancelar): ");
    numero = scan.nextInt();
    soma += numero; 
    
}while (numero != 0);

    System.out.println("O resultado final é: " + soma);
    
    }
}
