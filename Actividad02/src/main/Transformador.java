package main;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Transformador {
	
	public List<String> accion(List<String> lista);
	
}
