package exercicios;

import java.util.Scanner;

public class ex07 {
 
public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int idade;


    do{
    System.out.println("Informe a sua idade: ");
    idade = scan.nextInt();

    System.out.println("Informe uma idade válida: ");
    idade = scan.nextInt();

    }while (idade < 0 || idade > 120);
        
        System.out.println("Sua idade é: " + idade);

    }
}
