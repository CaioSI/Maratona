import java.io.IOException;
import java.util.Scanner;

public class MyClass {
	
	
	
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14159;
        
        System.out.println("Digite o valor:");
        double raio = sc.nextDouble();
        
        double volume = (4.0 / 3) * pi * Math.pow(raio, 3.0);
        
        System.out.println(String.format("VOLUME = %.3f", volume));
    }
	
}
