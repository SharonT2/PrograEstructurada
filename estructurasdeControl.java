import java.util.Scanner;

public class estructurasdeControl {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("-----TABLA DE MULTIPLICAR-----");
        System.out.print("Ingrese la tabla que desee calcular: ");
        int tabla = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mult = tabla*i;

            System.out.println(tabla + "*" + i + "=" + mult);
        }
    }
}
