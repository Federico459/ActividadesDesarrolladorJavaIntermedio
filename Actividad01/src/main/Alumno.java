package main;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer numeroLibreta;
    private ArrayList<Materia> materiasAprobadas;

    public Alumno(String nombre, Integer numero){
        this.nombre = nombre;
        this.numeroLibreta = numero;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroLibreta(Integer numeroLibreta) {
        this.numeroLibreta = numeroLibreta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNumeroLibreta() {
        return numeroLibreta;
    }

    public void addMateriasAprobadas(Materia materia){
        if(!materiasAprobadas.contains(materia)){
            this.materiasAprobadas.add(materia);
        }
    }

    public ArrayList<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}