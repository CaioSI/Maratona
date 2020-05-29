package extremelybasic1001;

import java.util.Scanner;


public class ExtremelyBasic1001 {

    
    public static void main(String[] args) {
       double A, B, X;
       
       Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A ");
        A = sc.nextDouble();
        System.out.print("Digite o Valor de B ");
        B = sc.nextDouble();
        
        X = A + B;
        
        System.out.println("O valor de X é igual a:" + X);
      
    }
    
}
