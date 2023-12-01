package main;

public class EstadoInit implements State {

	@Override
	public void actuar(Cancion cancion) {
		cancion.setState(new EstadoNormal());
		cancion.reiniciarPopularidad();
		cancion.actuar();
		
	}

}
