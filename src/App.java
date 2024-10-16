import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas personas desea ingresar?: ");
        int cantidadPersonas = scanner.nextInt();
        scanner.nextLine();

        Persona[] personas = new Persona[cantidadPersonas];

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            personas[i] = new Persona(nombre, edad);
        }

        MetodosBinarios metodos = new MetodosBinarios();

        metodos.ordenarPersonasPorEdadBurbuja(personas);

        System.out.print("Ingrese la edad que desea buscar: ");
        int edadBuscada = scanner.nextInt();

        int indice = metodos.busquedaBinaria(personas, edadBuscada);

        if (indice != -1) {
            System.out.println("Primera persona encontrada con " + edadBuscada + " años: " + personas[indice]);
        } else {
            System.out.println("No se encontró ninguna persona con " + edadBuscada + " años.");
        }

        scanner.close();
    }
}