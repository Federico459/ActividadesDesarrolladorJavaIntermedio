package main;
public class Main {
	public static void main(String[] args) {
        Alumno mateo = new Alumno("mateo",1);
        System.out.println(mateo.toString());
        Materia materia1 = new Materia("materia1");
        Materia materia2 = new Materia("materia2");
        Materia materia3 = new Materia("materia3");
		Materia materia4 = new Materia("materia4");
		materia3.addCorrelativa(materia1);
		materia4.addCorrelativa(materia2);
		materia4.addCorrelativa(materia3);
        mateo.addMateriasAprobadas(materia1);
        mateo.addMateriasAprobadas(materia3);
        System.out.println("aprobadas: " + mateo.getMateriasAprobadas());
		System.out.println("correlativas de materia 4: " + materia4.getCorrelativas());
		if (materia4.puedoCursar(mateo)) {
			System.out.println("Si puede cursar: " + materia4.getNombre());
		} else {
			System.out.println("No puede cursar " + materia4.getNombre());
		}
		Inscripcion inscripcionMateria2 = new Inscripcion(mateo, materia2);
		System.out.println(inscripcionMateria2.aprobado());
    }
}