import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Calculadora");
        System.out.println("----------------");
        System.out.println("Opciones:\n1)Suma\n2)Resta\n1)MultiplicaciÃ³n\n1)DivisiÃ³n\n");
        System.out.print("Ingrese la opciÃ³n: ");
        int opcion = entrada.nextInt();
        
        System.out.print("Ingrese el primer valor: ");
        double v1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        double v2 = entrada.nextDouble();
        double resultado;

        if (opcion==1){
            resultado=v1+v2;
            System.out.println("El resultado de la suma es: " + resultado);
        }else if (opcion==2){
            resultado=v1-v2;
            System.out.println("El resultado de la resta es: " + resultado);
        }else if (opcion==3){
            resultado=v1*v2;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        }else if (opcion==4){
            resultado=v1/v2;
            System.out.println("El resultado de la divisiÃ³n es: " + resultado);
        }else{
            System.out.println("Opcion no valida");
        }
    
    }
}
