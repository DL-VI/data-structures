package com.w3schools.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class StructureHashSet {
   public static void main(String[] args) {
      /*
      * Ejercicio 1: Crear y llenar un HashSet
      * Declara un HashSet<String> para almacenar nombres de ciudades.
      * Agrega al menos 5 nombres de ciudades a la colección.
      * Imprime el contenido del HashSet
      * */

      HashSet<String> cities = new HashSet<>();
      cities.add("Bogota");
      cities.add("Paris");
      cities.add("Madrid");
      cities.add("Berlin");
      cities.add("Moscu");

      System.out.println(cities + "\n");


      /*
      * Ejercicio 2: Verificar elementos en el HashSet
      * Usa el metodo para comprobar si "Bogotá" está en el HashSet.
      * Si existe, imprime un mensaje indicando que está presente.
      * Si no existe, imprime un mensaje indicando que no está en la colección.
      * */

      String searchCity = "Bogota";

      if (cities.contains(searchCity)) {
         System.out.println("The city of " + searchCity + " is in the collection.\n");
      }
      else System.out.println("The city " + searchCity + " is not in the collection.\n");


      /*
      * Ejercicio 3: Eliminar elementos
      * Usa el metodo para eliminar una ciudad del HashSet.
      * Después de eliminarla, imprime nuevament
      * */

      System.out.println(cities);
      cities.removeIf(city -> city.contains(searchCity));
      System.out.println(cities + "\n");


      /*
      * Ejercicio 4: Recorrer la colección
      * Usa un bucle for-each para recorrer el HashSet e imprimir cada ciudad.
      * Usa un Iterator para recorrer la colección y eliminar elementos que empiecen con la letra "M".
      * */

      cities.forEach(System.out::println);

      //cities.removeIf(city -> city.startsWith("M"));
      Iterator<String> it = cities.iterator();

      while (it.hasNext())
         if (it.next().toUpperCase().startsWith("M"))
            it.remove();


      System.out.println(cities + "\n");


      /*
      * Ejercicio 5: Encontrar la intersección entre dos conjuntos
      * Declara dos HashSet<Integer> y llena cada uno con diferentes conjuntos de números.
      * Usa el metodo para encontrar los elementos en común entre ambos conjuntos.
      * Imprime el conjunto resultante con los elementos compartidos.
      * */

      HashSet<Integer> numbers1 = new HashSet<>();
      numbers1.add(1);
      numbers1.add(2);
      numbers1.add(3);

      HashSet<Integer> numbers2 = new HashSet<>();
      numbers2.add(1);
      numbers2.add(3);
      numbers2.add(4);

      numbers1.retainAll(numbers2);
      System.out.println(numbers1);

   }
}
