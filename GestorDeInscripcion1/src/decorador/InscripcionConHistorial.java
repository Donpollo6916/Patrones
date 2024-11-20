package decorador;

import singleton.Universidad;

public class InscripcionConHistorial extends InscripcionBasica {
    public InscripcionConHistorial(Universidad universidad) {
        super(universidad);
    }

    @Override
    public void inscribir(Estudiante estudiante, String carrera) {

        if (estudiante.getHistorialAcademico() > 50) {
            super.inscribir(estudiante, carrera);
        } else {
            System.out.println(estudiante.getNombre() + " no cumple con los requisitos académicos para inscribirse.");
        }
    }
}