package observador;

import decorador.Estudiante;

public class Notificador implements Observador {
    public void notificarInscripcion(Estudiante estudiante, String carrera, boolean exito) {
        if (exito) {
            System.out.println(estudiante.getNombre() + " ha sido inscrito exitosamente en " + carrera);
        } else {
            System.out.println("Lo siento, no hay cupo en " + carrera + " para " + estudiante.getNombre());
        }
    }
}
