package average1006;

import java.util.Scanner;


public class Average1006 {

   
    public static void main(String[] args) {
        double A, B, C, MEDIA;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota A: ");
        A = sc.nextDouble();
        System.out.print("Digite a nota B: ");
        B = sc.nextDouble();
        System.out.print("Digite a nota C: ");
        C = sc.nextDouble();
        
        MEDIA = (A*2) + (B*3) + (C*5);
        MEDIA = MEDIA / 10;
        
        System.out.println("MEDIA = " + MEDIA);
        
        
        
    }
    
}
