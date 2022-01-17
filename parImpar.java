import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double numero;

        System.out.print("Ingrese el numero a verificar: ");
        numero = entrada.nextDouble();

        if(numero%2==0){
            System.out.println("El numero: "+ numero + " es par");
        }else{
            System.out.println("El numero: " + numero +" es impar");
        }
    }
}
