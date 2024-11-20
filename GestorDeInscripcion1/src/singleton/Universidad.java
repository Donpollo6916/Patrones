package singleton;

import observador.Observador;
import decorador.Estudiante;

public class Universidad {
    private static Universidad instancia;
    private String[] carreras = { "Ingeniería", "Arquitectura", "Medicina" };
    private int[] cupos = { 2, 3, 1 }; //
    private Observador inscripcionObserver;

    public static Universidad getInstance() {
        if (instancia == null) {
            instancia = new Universidad();
        }
        return instancia;
    }

    public void setObservador(Observador observer) {
        this.inscripcionObserver = observer;
    }

    public void inscribirEstudiante(Estudiante estudiante, String carrera) {
        int indice = -1;
        for (int i = 0; i < carreras.length; i++) {
            if (carreras[i].equals(carrera)) {
                indice = i;
                break;
            }
        }

        if (indice != -1 && cupos[indice] > 0) {
            cupos[indice]--;
            if (inscripcionObserver != null) {
                inscripcionObserver.notificarInscripcion(estudiante, carrera, true);
            }
        } else {
            if (inscripcionObserver != null) {
                inscripcionObserver.notificarInscripcion(estudiante, carrera, false);
            }
        }
    }
}
