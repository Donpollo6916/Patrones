package decorador;

import singleton.Universidad;

public class InscripcionBasica implements Inscripcion {
    private Universidad universidad;

    public InscripcionBasica(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public void inscribir(Estudiante estudiante, String carrera) {
        universidad.inscribirEstudiante(estudiante, carrera);
    }
}
