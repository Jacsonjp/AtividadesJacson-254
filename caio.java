import java.util.Scanner;

public class caio {
    public static void main(String[] args) {
        double barca, real;
        Scanner cobaia= new Scanner(System.in);
        System.out.println("ponha o valor em dolar:");
        barca = cobaia.nextDouble();
        real=(barca*4.79);
        System.out.println("em reais fica"+real);

    }
}
