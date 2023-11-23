package main;
import java.time.LocalDate;

public class Inscripcion {
    private Materia materia;
    private Alumno alumno;
    private LocalDate fecha;

    public Inscripcion(Alumno alumno,Materia materia) {
        this.fecha = LocalDate.now();
        this.alumno = alumno;
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public boolean aprobado() {
        return (! this.materia.tieneCorrelativas() || this.materia.puedoCursar(this.alumno));
    }

    @Override
    public String toString() {
        return "Alumno :"+this.getAlumno().toString()+"  Materia : "+this.materia.toString();
    }
}
