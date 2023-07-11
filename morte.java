import java.util.Scanner;

public class morte {
    public static void main(String[] args) {
        Scanner sacola = new Scanner(System.in);
        double i,m,d;
        System.out.println("sua idade: ");
        i= sacola.nextDouble();
        System.out.println("e meses: ");
        m= sacola.nextDouble();
        d=1;
        i=i*(d*365);
        m=m*(d*30);
        System.out.println(m+i);
    }
}
