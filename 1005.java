package average1005;

import java.util.Scanner;


public class Average1005 {

   
    public static void main(String[] args) {
       double A, B, MEDIA;
       
       Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota A: ");
        A = sc.nextDouble();
        System.out.print("Digite a nota B: ");
        B = sc.nextDouble();
        
        MEDIA = (A*3.5) + (B*7.5);
        MEDIA = MEDIA / 11;
        
        System.out.println("MEDIA = " + MEDIA);
        
    }
    
}
