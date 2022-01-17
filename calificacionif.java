import java.util.Scanner;

public class calificacionif {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double nota;
        System.out.println("Ingrese la nota obtenida: ");
        nota = entrada.nextDouble();
        
        if(nota>=61){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
    }
}
