import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arreglo3 = new int[7];

        int sumaTotal = 0;

        System.out.println("Ingrese los 7 números del primer arreglo:");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
            sumaTotal += arreglo1[i];
        }

        System.out.println("\nIngrese los 7 números del segundo arreglo:");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextInt();
            sumaTotal += arreglo2[i];
        }

        // Llenar tercer arreglo con la diferencia
        for (int i = 0; i < arreglo3.length; i++) {
            arreglo3[i] = arreglo1[i] - arreglo2[i];
            sumaTotal += arreglo3[i];
        }

        // Calcular promedio
        double promedio = (double) sumaTotal / (arreglo1.length * 3);

        System.out.println("\nDatos del tercer arreglo (diferencia):");
        for (int i = 0; i < arreglo3.length; i++) {
            System.out.println("Posición " + i + ": " + arreglo3[i]);
        }

        System.out.println("\nPromedio de todos los datos: " + promedio);

        scanner.close();
    }
}