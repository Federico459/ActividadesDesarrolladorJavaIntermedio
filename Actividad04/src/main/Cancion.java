package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cancion {
	
	private State state;
	
	private String Icono;
	
	private String titulo;
    private String artista;
    private String album;
    private int añoAlbum;
    //aca guardo los totales 
    private int reproducciones;
    private int likes;
    private int dislikes;
    private Date ultimaReproduccion;
    //utilizo estas banderas continuas para saber si bajar o subir estados
    private int reproduccionesContinuas;
    private int likesContinuos;
    private int dislikesContinuos;
	
    public Cancion(String titulo, String artista, String album, int añoAlbum) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.añoAlbum = añoAlbum;
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.reproduccionesContinuas = 0;
        this.likesContinuos = 0;
        this.dislikesContinuos = 0;
        this.setUltimaReproduccion(new Date());
        this.setState(new EstadoNormal());
    }
    
	public Cancion() {
		setState(new EstadoNormal());
	}
	
	public void actuar() {
		getState().actuar(this);
	}
	
	public void cambiarEstado(State nuevoEstado) {
		setState(nuevoEstado);
	}
	
	public void reproducir() {
        reproducciones++;
        reproduccionesContinuas++;
        setUltimaReproduccion(new Date());
    }

    public void darLike() {
        likes++;
        likesContinuos++;
    }

    public void darDislike() {
        dislikes++;
        dislikesContinuos++;
        if (dislikesContinuos >= 5000) {
            this.reiniciarPopularidad();
        }
    }
    
    public void setDiasSinReproducir(Integer dias) {
    	Calendar c = Calendar.getInstance();
    	c.add(Calendar.DATE, -dias);
    	this.setUltimaReproduccion(c.getTime());
    }
    
    public void reiniciarPopularidad() {
        this.reproduccionesContinuas = 0;
        this.likesContinuos = 0;
        this.dislikesContinuos = 0;
        this.setUltimaReproduccion(new Date());
    }

    public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public String getIcono() {
		return Icono;
	}
	
	public void setIcono(String icono) {
		Icono = icono;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public int getAñoAlbum() {
		return añoAlbum;
	}
	
	public void setAñoAlbum(int añoAlbum) {
		this.añoAlbum = añoAlbum;
	}
    
    public int getReproducciones() {
        return reproducciones;
    }
    
    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }
    
    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public int getDislikes() {
        return dislikes;
    }
    
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
    
    public int getReproduccionesContinuas() {
		return reproduccionesContinuas;
	}
    
    public void setReproduccionesContinuas(int reproduccionesContinuas) {
		this.reproduccionesContinuas = reproduccionesContinuas;
	}
    
    public int getLikesContinuos() {
		return likesContinuos;
	}
    
    public void setLikesContinuos(int likesContinuos) {
		this.likesContinuos = likesContinuos;
	}
    
    public int getDislikesContinuos() {
		return dislikesContinuos;
	}
    
    public void setDislikesContinuos(int dislikesContinuos) {
		this.dislikesContinuos = dislikesContinuos;
	}

	public Date getUltimaReproduccion() {
		return ultimaReproduccion;
	}

	public void setUltimaReproduccion(Date ultimaReproduccion) {
		this.ultimaReproduccion = ultimaReproduccion;
	}

}