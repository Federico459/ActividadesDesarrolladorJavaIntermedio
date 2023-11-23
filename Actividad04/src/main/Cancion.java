package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cancion {
    private String titulo;
    private String artista;
    private String album;
    private int añoAlbum;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private Date ultimaReproduccion;

    public Cancion(String titulo, String artista, String album, int añoAlbum) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.añoAlbum = añoAlbum;
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.ultimaReproduccion = new Date();
    }

    public void reproducir() {
        reproducciones++;
        ultimaReproduccion = new Date();
    }

    public void darLike() {
        likes++;
    }

    public void darDislike() {
        dislikes++;
        if (dislikes >= 5000) {
            this.reiniciarPopularidad();
        }
    }
    
    public void setDiasSinReproducir(Integer dias) {
    	Calendar c = Calendar.getInstance();
    	c.add(Calendar.DATE, -dias);
    	this.ultimaReproduccion = c.getTime();
    }
    
    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
    
    public int getReproducciones() {
        return reproducciones;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public String obtenerDetallePopularidad() {
    	if (dislikes >= 5000) {
            this.reiniciarPopularidad();
        }
        if (reproducciones < 1000) {
            return Icono.MUSICAL_NOTE.texto() + " (MUSICAL NOTE) - " + artista + " - " + album + " - " + titulo;
        } else if (reproducciones < 50000) {
            return Icono.ROCKET.texto() + " (ROCKET) - " + artista + " - " + titulo + " (" + album + " - " + añoAlbum + ")";
        } else {
            if (new Date().getTime() - ultimaReproduccion.getTime() <= 24 * 60 * 60 * 1000) {
                return Icono.FIRE.texto() + " (FIRE) - " + titulo + " - " + artista + " (" + album + " - " + añoAlbum + ")";
            } else {
                this.reiniciarPopularidad();
                return Icono.MUSICAL_NOTE.texto() + " (MUSICAL NOTE) - " + artista + " - " + album + " - " + titulo;
            }
        }
    }

    private void reiniciarPopularidad() {
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.ultimaReproduccion = new Date();
    }

    public static void main(String[] args) {
    	System.out.println("“The Scientist” recién se lanza (tiene popularidad normal).");
    	Cancion casoPrueba = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the Head", 2002);
    	System.out.println(casoPrueba.obtenerDetallePopularidad());
    	
    	System.out.println("");
    	System.out.println("“The Scientist” está en auge por superar el mínimo de reproducciones esperadas");
    	casoPrueba.setReproducciones(1000);
    	System.out.println(casoPrueba.obtenerDetallePopularidad());
    	
    	System.out.println("");
    	System.out.println("“The Scientist” baja del auge por tener muchos dislikes.");
    	casoPrueba.setDislikes(5000);
    	System.out.println(casoPrueba.obtenerDetallePopularidad());
    	
    	System.out.println("");
    	System.out.println("“The Scientist” es tendencia por récord de reproducciones y cantidad de personas que le gusta el tema");
    	casoPrueba.setReproducciones(50001);
    	System.out.println(casoPrueba.obtenerDetallePopularidad());
    	
    	System.out.println("");
    	System.out.println("“The Scientist” era tendencia pero vuelve a ser normal por no ser escuchada en las últimas horas");
    	casoPrueba.setDiasSinReproducir(1);
    	System.out.println(casoPrueba.obtenerDetallePopularidad());
    	
    	/*
    	System.out.println("");
    	System.out.println("*****Testeos extras*****");
        Cancion cancion1 = new Cancion("Cancion1", "Artista1", "Album1", 2022);
        Cancion cancion2 = new Cancion("Cancion2", "Artista2", "Album2", 2021);

        cancion1.setReproducciones(2000);
        cancion1.setLikes(30000);
        
        cancion2.setReproducciones(99999);
        cancion2.setLikes(33333);
        
        cancion1.reproducir();
        cancion2.reproducir();
        cancion2.reproducir();

        cancion1.darLike();
        cancion2.darLike();
        cancion2.darDislike();
        
        System.out.println("*****Testeo 1*****");
        System.out.println(cancion1.obtenerDetallePopularidad());
        System.out.println(cancion2.obtenerDetallePopularidad());
        
        cancion1.setDislikes(9999);
        cancion2.setDiasSinReproducir(10);
        System.out.println("");
        System.out.println("Cancion1 con 9999 dislikes");
        System.out.println("Cancion2 no se reproduce desde: " + cancion2.ultimaReproduccion);
        
        System.out.println("*****Testeo 2*****");
        System.out.println(cancion1.obtenerDetallePopularidad());
        System.out.println(cancion2.obtenerDetallePopularidad());*/
    }
}