import java.util.Scanner;
public class conversiones3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor;//valora  convertir
        double cm = 2.54;//centimetros en pulgadas
        double pulgada = 1;

        System.out.println("----------Convertiendo pulgadas a centimetros--------");
        System.out.print("Ingrese la cantidad a convertir: ");
        valor = sc.nextDouble();

        double resultado = (valor*cm) / pulgada;
        System.out.printf("%.2f pulgadas equivalen a %.2f centimetros\n", valor, resultado);
    }
}