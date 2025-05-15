package exercicios;

import java.util.Scanner;

public class ex03 {
    
    public static void main(String[] args) {
     
    Scanner scan = new Scanner(System.in);
    String senha = "";
    
    while(!senha.equals("1234")){

        System.out.println("Digite a senha: ");
        senha = scan.nextLine();
        System.out.println("Senha incorreta, digite novamente: ");
        senha = scan.nextLine();
    }

    System.out.println("Senha correta!");

    }
}
