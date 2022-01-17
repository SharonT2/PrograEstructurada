import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);//creando la instancia

        System.out.print("Cual es tu edad?: ");
        int edad = scanner.nextInt();

        System.out.println("Yo tambien tengo: " + edad + " años");

        System.out.print("Cuál es tu nombre?: ");
        String nombre = scanner.next();

        System.out.println("Yo también  me llamo: " + nombre);
    }
    
}
