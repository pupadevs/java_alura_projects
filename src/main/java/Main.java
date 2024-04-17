import com.projects.catalogo.CatalogoMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la aplicación a iniciar:");
        System.out.println("1. Catálogo de películas");
        System.out.println("2. Banco");
        System.out.print("Ingrese su elección: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                CatalogoMain.main(args);
                break;
            case 2:
                System.out.println("aun falta");;
                break;
            default:
                System.out.println("Opción no válida. Saliendo del programa.");
        }

        scanner.close();
    }
}
