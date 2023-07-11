
    import java.util.Scanner;

    public class vida_diaria {

        public static void main(String[] args) {
            Scanner caio = new Scanner(System.in);
            String nome,cidade;
            System.out.println("Digite seu nome: ");
            nome = caio.nextLine();
            System.out.println("Digite sua cidade: ");
            cidade = caio.nextLine();
            System.out.println("Olá " + nome+ " você mora na cidade de: "+ cidade);
        }
    }


