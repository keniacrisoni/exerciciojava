import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
     
        Double pi, area, raio;
        pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * Math.pow(raio,2);

        System.out.println("A = " + area);
       
    }
    
}
