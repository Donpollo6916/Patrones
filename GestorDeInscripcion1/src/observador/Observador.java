package observador;

import decorador.Estudiante;

public interface Observador {
    void notificarInscripcion(Estudiante estudiante, String carrera, boolean exito);
}
