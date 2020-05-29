package simplesum1003;

import java.util.Scanner;


public class SimpleSum1003 {

    
    public static void main(String[] args) {
       int A, B, SOMA;
       
       Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A ");
        A = sc.nextInt();
        System.out.print("Digite o Valor de B ");
        B = sc.nextInt();
        
        SOMA = A + B;
        
        System.out.println("SOMA =:" + SOMA);
      
    }
    
}
