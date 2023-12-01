package main;

import java.util.Date;

public class EstadoEnTendencia implements State {

	@Override
	public void actuar(Cancion cancion) {
		if (new Date().getTime() - cancion.getUltimaReproduccion().getTime() > 24 * 60 * 60 * 1000) {
			cancion.setState(new EstadoNormal());
			cancion.reiniciarPopularidad();
			cancion.actuar();
		} else {
			System.out.println(Icono.FIRE.texto() + " (FIRE) - " + cancion.getTitulo() + " - " + cancion.getArtista() + " (" + cancion.getAlbum() + " - " + cancion.getAñoAlbum() + ")");
		}
	}

}
