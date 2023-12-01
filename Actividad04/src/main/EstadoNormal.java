package main;

public class EstadoNormal implements State {

	@Override
	public void actuar(Cancion cancion) {
		if(cancion.getReproduccionesContinuas() > 1000) {
			cancion.setState(new EstadoEnAuge());
			cancion.actuar();
		} else {
			System.out.println(Icono.MUSICAL_NOTE.texto() + " (MUSICAL NOTE) - " + cancion.getArtista() + " - " + cancion.getAlbum() + " - " + cancion.getTitulo());
		}
	}

}
