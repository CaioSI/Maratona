package areacircle1002;

import java.util.Scanner;


public class AreaCircle1002 {

   
    public static void main(String[] args) {
        double A, R;
        double P = 3.14159;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do Raio ");
        R = sc.nextDouble();
        
        A = P*(R*R);
        
        System.out.println("A aréa do circulo é: " + A);
        
    }
    
}
