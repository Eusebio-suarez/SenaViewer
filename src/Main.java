import edu.misena.senaviewer.model.Book;
import edu.misena.senaviewer.model.Chapter;
import edu.misena.senaviewer.model.Magazine;
import edu.misena.senaviewer.model.Movie;
import edu.misena.senaviewer.model.Serie;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            // meni inicio
            System.out.println("Sena Viewer");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("7. Exit");
            System.out.print("Ingrese una opcion: ");

            //opción del usuario
            option = scanner.nextInt();

            // Realizar opción
            switch (option) {
                case 1:
                    System.out.println("opción Movies");
                    // Aquí podrías llamar a un método que maneje las películas
                    break;
                case 2:
                    System.out.println("opción Series");
                    // Aquí podrías llamar a un método que maneje las series
                    break;
                case 3:
                    System.out.println("opción Books");
                    // Aquí podrías llamar a un método que maneje los libros
                    break;
                case 4:
                    System.out.println("opción Magazines");
                    // Aquí podrías llamar a un método que maneje las revistas
                    break;
                case 5:
                    System.out.println("opción report...");
                    // Aquí podrías llamar a un método para generar un reporte
                    break;
                case 6:
                    System.out.println("opción todays report");
                    // Aquí podrías llamar a un método para generar el reporte de hoy
                    break;
                case 7:
                    System.out.println("saliendo ...");
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
            System.out.println();
            System.out.println();
        } while (option != 7);
    }
}
