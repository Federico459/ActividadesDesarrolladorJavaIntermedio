package main;

import java.util.ArrayList;
import java.util.List;

public class Transformador {
	
    List<String> listaStrings = new ArrayList<>();
    
    public Transformador(List<String> lista){
        this.listaStrings = lista;
    }
    
    public List<String> Transformar(){
        List<String> lista = new ArrayList<>();
        for (String item: this.listaStrings) {
        	lista.add(item.toString().toUpperCase());
        }
        return lista;
    }
    
    public String concatenarPalabrasDeNCaracteres(Integer n) {
    	String respuesta = "";
    	for(String item: listaStrings) {
    		if(item.length() > n) {
    			respuesta += item.toString() + ", ";
    		}
    	}
    	respuesta.replaceFirst(", ", "");
    	return respuesta;
    }
    
}