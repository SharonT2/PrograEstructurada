public class arrays {
    public static void main(String[] args) {
        
        int array[] = new int[3];
        int array2[] = {1,2,3};
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println("Valor en la posición 0 del array1: " + array[0]);//en este caso es 1
        System.out.println("Valor en la posición 1 del array1: " + array[1]);//en este caso es 2
        System.out.println("Valor de la posición 2 del array1: " + array[2]);//en este caso es 3
        

        System.out.println("Datos del array2");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
