import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, area, raio, pi;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        raio = C;
        pi = 3.14159;
     
        area = pi * Math.pow(raio,2);       
                           

        System.out.printf("Area do circulo = %.2f", area);
        sc.close(); 
    }
}
