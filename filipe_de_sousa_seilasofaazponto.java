

import java.util.Scanner;

public class filipe_de_sousa_seilasofaazponto {
        public static void main(String[] args) {
            Scanner jilherme = new Scanner(System.in);
            String nome,cidade;
            int idade;
            System.out.println("Digite seu nome: ");
            nome = jilherme.nextLine();
            System.out.println("Digite sua cidade: ");
            cidade = jilherme.nextLine();
            System.out.println("Digite sua idade: ");
            idade = jilherme.nextInt();
            System.out.println("Seu nome é: " + nome+ "\nSua cidade é: "+cidade+ "\nSua idade é: " +idade);
        }
    }

