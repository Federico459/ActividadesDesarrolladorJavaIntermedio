package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<String> listado = new ArrayList<>();
        listado.add("uno");
        listado.add("Dos");
        listado.add("trES");
        listado.add("CUATRO");
        listado.add("CiNCo");
        listado.add("seis");
        listado.add("siete");
        listado.add("OcHo");
        listado.add("NUeVE");
        listado.add("diez");
        System.out.println("***LISTA***");
        System.out.println(listado);
        System.out.println("***LISTA EN MAYUSCULA***");
        System.out.println(listaToUpperCase(listado));
        System.out.println("***LISTA FILTRADA (3)***");
        System.out.println(filtrarByCantCaracteres(listado,3));
        System.out.println("***LISTA FILTRADA (4)***");
        System.out.println(filtrarByCantCaracteres(listado,4));
    }
	
	public static List<String> listaToUpperCase(List<String> lista) {
		return lista.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
	}
	
	public static String filtrarByCantCaracteres(List<String> lista, Integer cantidad) {
		return String.join(", ", lista.stream().filter(str -> str.length() > cantidad).collect(Collectors.toList()));
	}
}