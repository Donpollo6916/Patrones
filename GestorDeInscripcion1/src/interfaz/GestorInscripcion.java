
package interfaz;

import java.util.Scanner;
import singleton.Universidad;
import observador.Notificador;
import decorador.*;

public class GestorInscripcion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Universidad universidad = Universidad.getInstance();
        Notificador notificador = new Notificador();
        universidad.setObservador(notificador);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el historial académico del estudiante: ");
        int historialAcademico = sc.nextInt();
        sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre, historialAcademico);

        System.out.println("Carreras disponibles:");
        String[] carreras = { "Ingeniería", "Arquitectura", "Medicina" };
        for (int i = 0; i < carreras.length; i++) {
            System.out.println((i + 1) + ". " + carreras[i]);
        }

        System.out.print("Ingrese el número de la carrera a la que desea inscribirse: ");
        int carreraIndex = sc.nextInt();
        sc.nextLine();

        String carreraSeleccionada = carreras[carreraIndex - 1];

        Inscripcion inscripcion = new InscripcionConHistorial(universidad);

        inscripcion.inscribir(estudiante, carreraSeleccionada);
        sc.close();
    }
}