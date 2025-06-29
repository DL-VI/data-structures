package com.w3schools.collection.map;

import java.util.Iterator;
import java.util.TreeMap;

public class StructureTreeMap {
   public static void main(String[] args) {
      /*
      * Ejercicio 1: Crear y llenar un TreeMap
      * Declara un TreeMap<String, String> para almacenar países y sus capitales.
      * Agrega al menos 5 pares clave-valor (país, capital).
      * Imprime el contenido del TreeMap y verifica que esté ordenado por clave.
      * */

      TreeMap<String, String> cities = new TreeMap<>();
      cities.put("Colombia", "Bogota");
      cities.put("France", "Paris");
      cities.put("Albania", "Tirana");
      cities.put("Germany", "Berlin");
      cities.put("Russia", "Moscu");

      System.out.println(cities + "\n");


      /*
      * Ejercicio 2: Acceder y modificar valores
      * Usa get() para obtener la capital de un país específico.
      * Modifica la capital de un país existente usando put().
      * Imprime el TreeMap después de la modificación.
      * */

      String country = "Germany";
      System.out.println(cities.get(country));

      cities.put(country, "Munich");
      System.out.println(cities + "\n");


      /*
      * Ejercicio 3: Eliminar elementos
      * Usa remove() para eliminar un país del TreeMap.
      * Luego, imprime el conjunto resultante para verificar los cambios.
      * */

      cities.remove(country);
      System.out.println(cities + "\n");


      /*
      * Ejercicio 4: Recorrer la colección
      * Usa un bucle for-each para recorrer el TreeMap e imprimir cada país y su capital.
      * Usa un Iterator para recorrer la colección y eliminar países con nombres que comiencen con "A".
      * */

      for (String key : cities.keySet())
         System.out.println(key + ": " + cities.get(key));


      Iterator<String> it = cities.keySet().iterator();

      while (it.hasNext())
         if (it.next().toUpperCase().startsWith("A"))
            it.remove();

      System.out.println(cities + "\n");


      /*
      * Ejercicio 5: Encontrar elementos dentro de un rango
      * Declara un TreeMap<Integer, String> con números como clave y nombres de productos como valores.
      * Usa subMap() para obtener los productos dentro de un rango de claves específico.
      * Imprime los valores obtenidos.
      * */

      TreeMap<Integer, String> elements = new TreeMap<>();
      elements.put(1, "Yellow");
      elements.put(2, "Blue");
      elements.put(3, "Red");
      elements.put(4, "Brown");

      System.out.println(elements.subMap(1, 4));

   }
}
