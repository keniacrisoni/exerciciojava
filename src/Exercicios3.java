import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        int resultado = (A * B - C * D);  

        System.out.println("o resultado é " + resultado);

        sc.close();
    }
}
