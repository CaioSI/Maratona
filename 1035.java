import java.io.IOException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws IOException {
    int A;
    int B;
    int C;
    int D;
    
    Scanner sc = new Scanner(System.in);
     
    System.out.println("A:");
    A = sc.nextInt();
    
    System.out.println("B:");
    B = sc.nextInt();
    
    System.out.println("C:");
    C = sc.nextInt();
    
    System.out.println("D:");
    D = sc.nextInt();
    
    if (B > C && D > A && C + D > A + B & C > 0 && D > 0 && A % 2 == 0){
        System.out.println("Valores aceitos");
    }else{
       System.out.println("Valores não aceitos"); 
    }
    
    
    
    }
}
