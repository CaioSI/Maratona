import java.io.IOException;
import java.util.Scanner;

public class MyClass {
	
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
		
		    System.out.println("Digite o 1 código do produto:");
            int cod1 = sc.nextInt();
        
            System.out.println("Digite o 1 número do produto:");
            int n1 = sc.nextInt();
        
            System.out.println("Digite o 1 valor do produto:");
            double valor1 = sc.nextDouble();
		
		    System.out.println("Digite o 2 código do produto:");
            int cod2 = sc.nextInt();
        
            System.out.println("Digite o 2 número do produto:");
            int n2 = sc.nextInt();
        
            System.out.println("Digite o 2 valor do produto:");
            double valor2 = sc.nextDouble();
		
            double total = (n1 * valor1) + (n2 * valor2);
        
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));   
    }
	
}
