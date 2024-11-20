package decorador;

public class Estudiante {
    private String nombre;
    private int historialAcademico;

    public Estudiante(String nombre, int historialAcademico) {
        this.nombre = nombre;
        this.historialAcademico = historialAcademico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHistorialAcademico() {
        return historialAcademico;
    }
}
