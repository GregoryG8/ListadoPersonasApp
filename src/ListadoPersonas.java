import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonas {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        List<Persona> personas = new ArrayList<Persona>();

        var salir = false;
        while(!salir) {
            mostrarMenu();
            System.out.println();
        }

    }

    public static void mostrarMenu() {
        System.out.println("""
                *** Listado Personas ***
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.println("Que opcion?: ");
    }
}