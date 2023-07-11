import java.util.Scanner;

public class fortatacado {
    public static void main(String[] args) {
        Scanner verde=new Scanner(System.in);
        double a,p,n;
        System.out.println("preço produto");
        a= verde.nextDouble();
        System.out.println("quantidade:");
        p= verde.nextDouble();
        n=p*a;
        System.out.println("total fica:"+n);
    }
}
