import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, area;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
     
        area = A * C /2;     
                              

        System.out.printf("Area = %.2f", area);
        sc.close(); 
    }
}
