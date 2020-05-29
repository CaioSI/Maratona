import java.util.Scanner;
class MyClass {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int distancia = input.nextInt();
        double ccasto = input.nextDouble();

        double mediaccasto = distancia / ccasto;
        System.out.printf("%.3f km/l%n", mediaccasto);

    }
}
