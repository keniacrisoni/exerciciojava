import java.util.Locale;
import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        
       // area = largura x comprimento
       // preço = area x preço do metro quadrado
       // largura = 10.0
       // comprimento = 30.0
       // preço = 200.00 por metro

        double largura, comprimento, metroQuadrado, area, preco;
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        metroQuadrado = sc.nextDouble();
        area = largura * comprimento;
        preco = area * metroQuadrado;

       // System.out.println("Area = " + area);
       // System.out.println("Preco = " + preco);

        System.out.printf("Area = %.2f", area);
        System.out.printf("Preco = %.2f", preco);

        sc.close();
    }
}
