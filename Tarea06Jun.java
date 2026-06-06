package Principal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tarea06Jun {

    public static void main(String[] args) {

        int valorBuscado = 250000;

        List<Integer> listadoCaciones = new ArrayList<Integer>();
        //List<Integer> listadoCaciones = new LinkedList<Integer>();

        for (int i = 0; i < 500000; i++) {
            listadoCaciones.add(i);
        }

        System.out.println("Tamaño de lista : " + listadoCaciones.size());
        
        long inicio = System.nanoTime();
        	int cancion = listadoCaciones.get(valorBuscado);
        long fin = System.nanoTime();
        
        System.out.println("Tiempo Transcurido: " + (fin - inicio));
        
        
        // LinkedList: 2130700
        // ArrayList: 4800 
        
        List<Integer> listadoEstudiantes = new ArrayList<Integer>();
        long inicioInsercion = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
        	listadoEstudiantes.addFirst(i);
        }
        long finInsercion = System.nanoTime();
        
        System.out.println("\n-----Tamaño de Lista: \t " + listadoEstudiantes.size());
        System.out.println("Tiempo transcurrido:" +
        		(finInsercion-inicioInsercion)/1000000 +"ms");
        }
               
}