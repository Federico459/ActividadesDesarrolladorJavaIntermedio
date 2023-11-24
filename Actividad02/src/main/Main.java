package main;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(transformarLista(listado,(ls -> {
        	List<String> respuesta = new ArrayList<>();
        	for(String str: ls) {
        		respuesta.add(str.toUpperCase());
        	}
        	return respuesta;
        })));
        System.out.println("***lista en minuscula***");
        System.out.println(transformarLista(listado,(ls -> {
        	List<String> respuesta = new ArrayList<>();
        	for(String str: ls) {
        		respuesta.add(str.toLowerCase());
        	}
        	return respuesta;
        })));
    }
	
	public static List<String> transformarLista(List<String> lista, Transformador t) {
		return t.accion(lista);
	}
	
	
}