import java.util.Scanner;

public class obesidade {
    public static void main(String[] args) {
        Scanner verde=new Scanner(System.in);
        double a,p,imc;
        System.out.println("altura:");
        a= verde.nextDouble();
        System.out.println("peso:");
        p= verde.nextDouble();
        imc=p/(a*a);
        System.out.println("seu imc é:"+imc);
    }
}
