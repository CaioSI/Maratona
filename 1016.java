import java.util.Scanner;
class MyClass {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);


        int distancia = input.nextInt();
        int minutos = (60 * distancia) / 30;

        System.out.println(minutos + " minutos");

    }
}
