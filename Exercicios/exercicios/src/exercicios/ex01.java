package exercicios;

import java.util.Scanner;

public class ex01{

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira um número: ");
    int numero = scan.nextInt();


    while(numero >= 0){

        System.out.println("A contagem até zero é: " + numero);
        numero--;
    }
    

    }
}