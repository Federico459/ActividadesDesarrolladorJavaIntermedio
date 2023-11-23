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
        for (String item: listado){
            System.out.print(item + " ");
        }
        Transformador lista = new Transformador(listado);
        List<String> resultado = lista.Transformar();
        System.out.println("");
        System.out.println("***LISTA EN MAYUSCULA***");
        for (String item: resultado){
            System.out.print(item + " ");
        }
        System.out.println("");
        System.out.println("***LISTA EN CONCATENAR***");
        System.out.println(lista.concatenarPalabrasDeNCaracteres(4));
    }
}