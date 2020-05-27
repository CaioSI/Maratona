import java.io.IOException;
import java.util.Scanner;

public class MyClass {
	
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de A:");
        double a = sc.nextDouble();
        
        System.out.println("Digite o valor de B:");
        double b = sc.nextDouble();
        
        System.out.println("Digite o valor de C:");
        double c = sc.nextDouble();
        
        
        double triangulo = a * c / 2.0;
        
        
        double circulo = 3.14159 * (c * c);
        
        
        double trapezio = ((a + b) * c) / 2;
        
        
        double quadrado = b * b;
        
        
        double retangulo = a * b;
        
        
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        
        System.out.println(String.format("RETANGULO: %.3f", retangulo));  
    }
	
}
