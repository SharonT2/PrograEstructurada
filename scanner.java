import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);//creando la instancia

        System.out.print("Cual es tu edad?: ");
        int edad = scanner.nextInt();

        System.out.println("Yo tambien tengo: " + edad + " a�os");

        System.out.print("Cu�l es tu nombre?: ");
        String nombre = scanner.next();

        System.out.println("Yo tambi�n  me llamo: " + nombre);
    }
    
}
