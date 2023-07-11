
import java.util.Scanner;
import java.lang.Math;
public class bola_alta {

    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);
        double n1, n2;
        System.out.println("Escreva o Numero: ");
        n1 = figo.nextFloat();
        n2 = Math.floor(n1);
        System.out.println("o resultado sera: " + n2);
    }
}
