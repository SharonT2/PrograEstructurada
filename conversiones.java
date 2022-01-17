public class conversiones {
    public static void main(String[] args) {

        //Pasar de centímetros a pulgadas
        double valor = 10;
        double cm = 2.54;
        double pulgada = 1;
        double resultado = (valor * pulgada)/cm;
        System.out.println("Resultado: " + resultado);

        double valorPulgadas = 5;
        double resultado2 = (valorPulgadas*cm)/pulgada;

        System.out.println("Resultado2: " + resultado2);

    }
    
}
