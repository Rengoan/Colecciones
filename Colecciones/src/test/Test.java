package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        for (String elem : miLista) {
            System.out.println("Elementos = " + elem);
        }
        System.out.println("");

        imprimir(miLista);

        Map miMap = new HashMap();

        miMap.put("valor1", "Santiago");
        miMap.put("valor2", "Luis");
        miMap.put("valor3", "Pepe");
        miMap.put("valor4", "Alejandra");
        miMap.put("valor5", "Maria");

        String nombre = (String)miMap.get("Valor3");
        System.out.println("");
        System.out.println("nombre = " + nombre);
        
        imprimir(miMap.keySet());//Devuelve las claves
        imprimir(miMap.values()); //Devuelve todos los valores de map

    }

    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elem -> {
            System.out.println("Elementos = " + elem);
        });

    }

}
