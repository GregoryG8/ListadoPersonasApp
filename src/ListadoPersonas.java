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
            try {
                salir = ejecutarOperacion(consola, personas);
            }catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
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

    public static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;

        switch (opcion) {
            case 1:
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //Crear el objeto persona
                var persona = new Persona(nombre, telefono, email);
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " personas");
                break;

            case 2:
                System.out.println("Listado de personas: ");
                //Usando lambda y metodo de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
                break;

            case 3:
                System.out.println("Hasta luego...");
                salir = true;
                break;

            default:
                System.out.println("Opcion no valida " + opcion);
        }
        return salir;
    }
}