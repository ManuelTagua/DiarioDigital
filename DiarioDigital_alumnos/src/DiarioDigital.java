import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiarioDigital {

    private static final String FICHERO = "diario.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Escribe tu entrada:");
                    String entrada = sc.nextLine();
                    guardarEntrada(entrada);
                    break;
                case 2:
                    leerDiario();
                    break;
                case 3:
                    System.out.println("Introduce la palabra a buscar:");
                    String palabra = sc.nextLine();
                    buscarEnDiario(palabra);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== Mi Diario Digital ===");
        System.out.println("1. Añadir nueva entrada");
        System.out.println("2. Leer todo el diario");
        System.out.println("3. Buscar palabra en el diario");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    private static void guardarEntrada(String texto) {
        // TODO: Implementar escritura en el fichero "diario.txt"
        //  - Abrir FileWriter en modo append (true)
        //  - Escribir la fecha y hora actual + el texto de la entrada. Comprobar que el formato de fecha escrita es OK.
        //  - Cerrar el flujo correctamente
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String fecha = LocalDateTime.now().format(formatter);
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(FICHERO, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            pw.println("[" + fecha + "]");
            pw.println(texto);
            pw.println();

            System.out.println("Entrada guardada correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        } finally {
            if (pw != null) pw.close();
            try {
                if (bw != null) bw.close();
            } catch (IOException ignored) {}
            try {
                if (fw != null) fw.close();
            } catch (IOException ignored) {}
        }
    }

    private static void leerDiario() {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(FICHERO);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Aún no existe el diario. Escribe tu primera entrada.");
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ignored) {}
            try {
                if (fr != null) fr.close();
            } catch (IOException ignored) {}
        }
    }

    private static void buscarEnDiario(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            System.out.println("La palabra de búsqueda no puede estar vacía.");
            return;
        }

        FileReader fr = null;
        BufferedReader br = null;
        boolean encontradaAlguna = false;

        try {
            fr = new FileReader(FICHERO);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(palabra)) {
                    System.out.println(linea);
                    encontradaAlguna = true;
                }
            }

            if (!encontradaAlguna) {
                System.out.println("No se encontraron líneas que contengan: \"" + palabra + "\"");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Aún no existe el diario. Escribe tu primera entrada.");
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ignored) {}
            try {
                if (fr != null) fr.close();
            } catch (IOException ignored) {}
        }
    }
}

