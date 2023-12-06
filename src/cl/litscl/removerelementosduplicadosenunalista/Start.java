package cl.litscl.removerelementosduplicadosenunalista;

import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
	
		//1. Crear la lista duplicada.
        ArrayList<String> listaDuplicada = new ArrayList<String>();
        
        listaDuplicada.add("1");
        listaDuplicada.add("1");
        listaDuplicada.add("2"); 
        listaDuplicada.add("3");
        listaDuplicada.add("3");
        listaDuplicada.add("4"); 
        listaDuplicada.add("5");
        listaDuplicada.add("5");
        
        //2. Crear una lista nueva sin los duplicados.
        ArrayList<String> listaNoDuplicada = removerDuplicados(listaDuplicada);
		
		for (String elemento : listaNoDuplicada) {
			System.out.println(elemento);
		}
	}
	
	public static <T> ArrayList<T> removerDuplicados(ArrayList<T> listaDuplicada) {
        ArrayList<T> listaNoDuplicada = new ArrayList<T>();
  
        for (T elemento : listaDuplicada) {
            if (!listaNoDuplicada.contains(elemento)) {
            	listaNoDuplicada.add(elemento);
            }
        }

        return listaNoDuplicada;
    }  

}
