import java.util.Scanner;

public class calculadoraCiclo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("------Calculadora------");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Salir");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            opcion = leer.nextInt();
            double v1, v2;
            double resultado;

            switch(opcion){
                case 1:
                    System.out.println("*Suma*");
                    System.out.print("Ingrese el primer valor: ");
                    v1 = leer.nextDouble();
                    System.out.print("Ingrese el segundo valor: ");
                    v2 = leer.nextDouble();
                    resultado = v1+v2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    System.out.println("*Resta*");
                    System.out.print("Ingrese el primer valor: ");
                    v1 = leer.nextDouble();
                    System.out.print("Ingrese el segundo valor: ");
                    v2 = leer.nextDouble();
                    resultado = v1-v2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    System.out.print("*Multiplicacion*");
                    System.out.print("Ingrese el primer valor: ");
                    v1 = leer.nextDouble();
                    System.out.print("Ingrese el segundo valor: ");
                    v2 = leer.nextDouble();
                    resultado = v1*v2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 4:
                    System.out.println("*Division*");
                    System.out.print("Ingrese el primer valor: ");
                    v1 = leer.nextDouble();
                    System.out.print("Ingrese el segundo valor: ");
                    v2 = leer.nextDouble();
                    resultado = v1/v2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 5:
                    System.out.println("Vuelve pronto!");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 5);
    }
}
