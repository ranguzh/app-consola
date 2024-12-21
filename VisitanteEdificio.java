import java.util.Scanner;

public class VisitanteEdificio {
    public static void main(String[] args) {
        // Información del visitante
        String nombre = "Juan Pérez";
        int apartamento = 305;
        char genero = 'M';
        boolean autorizacion = true;
        byte edad = 30;
        long telefono = 6551234567L;

        // Información adicional
        float tiempoVisita = 2.5f;
        double saldoCuenta = 1500.75;


        // Información del edificio
        String direccion = "Calle Principal, No. 123";
        int numDepartamentos = 10;

        // Mostrar información del visitante
        System.out.println("Visitante: " + nombre);
        System.out.println("Apartamento: " + apartamento);
        System.out.println("Género: " + genero);
        System.out.println("Autorización: " + (autorizacion ? "Sí" : "No"));
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Tiempo de visita: " + tiempoVisita + " horas");
        System.out.println("Saldo: $" + saldoCuenta);

        // Mostrar información del edificio
        System.out.println("\nEdificio: " + direccion);
        System.out.println("Departamentos: " + numDepartamentos);

        // Operación de ejemplo
        int suma = edad + 5;
        System.out.println("\nEdad + 5 = " + suma);

        // Leer número de apartamento
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el número de apartamento del visitante: ");
        int apartamentoLeido = scanner.nextInt();
        System.out.println("Apartamento leído: " + apartamentoLeido);

        System.out.println("Fin del registro.");
    }
}
