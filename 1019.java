import java.util.Scanner;
class MyClass {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

       int segundos = input.nextInt();

       int horas = segundos / 3600;
       segundos = segundos % 3600;

       int minutos = segundos / 60;
       segundos = segundos % 60;

       int qsegundos = segundos;

       System.out.println(horas + ":" + minutos +":" + qsegundos );

    }
}
