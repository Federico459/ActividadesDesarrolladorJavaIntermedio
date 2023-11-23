package main;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Materia> correlativas;

    public Materia(String nombre){
        this.nombre = nombre;
        correlativas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorrelativas(ArrayList<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public void  addCorrelativa(Materia materia){
         this.correlativas.add(materia);
    }

    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }

    public boolean puedoCursar(Alumno alumno){
       return alumno.getMateriasAprobadas().containsAll(this.getCorrelativas());
    }

    public boolean tieneCorrelativas(){
      return ! this.correlativas.isEmpty();
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
