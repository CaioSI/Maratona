import java.io.IOException;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) throws IOException {
        
        double a, b, c,delta, x1, x2;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o valor de a, b, c:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        delta = b * b - 4 * a * c;
        
        if(a > 0 && delta >=0){
            x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
            
            System.out.printf("%n R1= %.5f ", x1);
            System.out.printf("%n R2= %.5f ", x2);
        }else{
            System.out.println("Impossível calcular");
        }
        
        
    }
}
