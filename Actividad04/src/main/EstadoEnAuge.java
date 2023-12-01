package main;

public class EstadoEnAuge implements State {

	@Override
	public void actuar(Cancion cancion) {
		if (cancion.getDislikesContinuos() >= 5000) {
			cancion.setState(new EstadoNormal());
			cancion.reiniciarPopularidad();
			cancion.actuar();
		} else {
			if (cancion.getReproduccionesContinuas() > 50000 && cancion.getLikesContinuos() > 20000) {
				cancion.setState(new EstadoEnTendencia());
				cancion.actuar();
			} else {
				System.out.println(Icono.ROCKET.texto() + " (ROCKET) - " + cancion.getArtista() + " - " + cancion.getTitulo() + " (" + cancion.getAlbum() + " - " + cancion.getAñoAlbum() + ")");
			}
		}
	}

}
