package main;

public class Main {
	public static void main(String[] args) {
		System.out.println("“The Scientist” recién se lanza (tiene popularidad normal).");
    	Cancion casoPrueba = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the Head", 2002);
    	casoPrueba.actuar();
    	//Hago los sets de reproducir like y dislike para no tener que utilizar miles de veces los metodos para llegar a los valores para que cambien de estado.
    	System.out.println("");
    	System.out.println("“The Scientist” está en auge por superar el mínimo de reproducciones esperadas");
    	casoPrueba.setReproducciones(1001);
    	casoPrueba.setReproduccionesContinuas(1001);
    	casoPrueba.actuar();
    	
    	System.out.println("");
    	System.out.println("“The Scientist” baja del auge por tener muchos dislikes.");
    	casoPrueba.setDislikes(5000);
    	casoPrueba.setDislikesContinuos(5000);
    	casoPrueba.actuar();
    	
    	System.out.println("");
    	System.out.println("“The Scientist” es tendencia por récord de reproducciones y cantidad de personas que le gusta el tema");
    	casoPrueba.setReproducciones(50001);
    	casoPrueba.setReproduccionesContinuas(50001);
    	casoPrueba.setLikes(30000);
    	casoPrueba.setLikesContinuos(30000);
    	casoPrueba.actuar();
    	
    	System.out.println("");
    	System.out.println("“The Scientist” era tendencia pero vuelve a ser normal por no ser escuchada en las últimas horas");
    	casoPrueba.setDiasSinReproducir(1);
    	casoPrueba.actuar();
    	
	}
}
