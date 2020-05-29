import java.util.Scanner;
class MyClass {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);


        int horas = input.nextInt();
        int distencia = input.nextInt();

        int litro = horas * distencia;
        double gastos = litro / 12.0;

        System.out.printf("%.3f%n", gastos);

    }
}
