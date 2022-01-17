import java.util.Scanner;

public class sentenciaSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora utilizando el método Switch");
        System.out.println("1)Sumar");
        System.out.println("2)Restar");
        System.out.print("Ingrese la opción que quiere realizar: ");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el primer Número: ");
                float n1=entrada.nextFloat();
                System.out.print("Ingrese el segundo Número: ");
                float n2= entrada.nextFloat();
                float resultado=n1+n2;
                System.out.println("La suma de los números ingresados es: " + resultado );
                break;
            case 2:
                System.out.print("Ingrese el primer Número: ");
                float n12=entrada.nextFloat();
                System.out.print("Ingrese el segundo Número: ");
                float n22= entrada.nextFloat();
                float resultado2=n12+n22;
                System.out.println("La resta de los números ingresados es: " + resultado2 );
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
