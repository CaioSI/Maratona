package simpleproducto1004;

import java.util.Scanner;


public class SimpleProducto1004 {

    
    public static void main(String[] args) {
        int A, B, PROD;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        
        PROD = A * B;
        
        System.out.println("PROD = " + PROD);
        
        
    }
    
}
