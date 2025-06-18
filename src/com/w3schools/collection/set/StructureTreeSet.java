package com.w3schools.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class StructureTreeSet {
   public static void main(String[] args) {
      /*
      * Ejercicio 1: Crear y llenar un TreeSet
      * Declara un TreeSet<String> para almacenar nombres de países.
      * Agrega al menos 5 nombres de países a la colección.
      * Imprime el contenido del TreeSet y verifica que estén ordenados alfabéticamente.
      * */

      TreeSet<String> countries = new TreeSet<>();
      countries.add("Chile");
      countries.add("Italy");
      countries.add("Colombia");
      countries.add("Germany");
      countries.add("Russian");

      System.out.println(countries + "\n");


      /*
      * Ejercicio 2: Verificar elementos en el TreeSet
      * Usa el metodo para comprobar si "Colombia" está en el TreeSet.
      * Si existe, imprime un mensaje indicando que está presente.
      * Si no existe, imprime un mensaje indicando que no está en la colección.
      * */

      String searchCountry = "Colombia";

      String message = countries.contains(searchCountry) ?
         "The country " + searchCountry + " is in the collection.\n" :
         "The country " + searchCountry + " is not the collecion.\n";

      System.out.println(message);


      /*
      * Ejercicio 3: Obtener el primer y último elemento
      * Usa los metodos para obtener el primer y último elemento del TreeSet.
      * Imprime ambos valores para verificar el orden.
      * */

      System.out.println("First item is: " + countries.first());
      System.out.println("Last item is: " + countries.last() + "\n");


      /*
      * Ejercicio 4: Recorrer la colección
      * Usa un bucle for-each para recorrer el TreeSet e imprimir cada país en orden.
      * Usa un Iterator para recorrer la colección y eliminar elementos que empiecen con la letra "C".
      * */

      countries.forEach(System.out::println);
      //countries.removeIf(country -> country.toUpperCase().startsWith("C"));
      Iterator<String> it = countries.iterator();

      while (it.hasNext())
         if (it.next().startsWith("C"))
            it.remove();

      System.out.println();
      countries.forEach(System.out::println);
      System.out.println();


      /*
      * Ejercicio 5: Encontrar elementos dentro de un rango
      * Declara un TreeSet<Integer> y llena la colección con números enteros.
      * Usa un metodo para obtener un subconjunto de elementos dentro de un rango específico.
      * Imprime los valores obtenidos.
      * */

      TreeSet<Integer> numbers = new TreeSet<>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(4);
      numbers.add(5);

      //Subconjunto de elementos de un rango en especifico.
      System.out.println(numbers.subSet(2, 5));
   }
}
