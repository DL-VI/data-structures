package com.w3schools.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class StructureLinkedHashSet {
   public static void main(String[] args) {
      /*
      * Ejercicio 1: Crear y llenar un LinkedHashSet
      * Declara un LinkedHashSet<String> para almacenar nombres de animales.
      * Agrega al menos 5 nombres a la colección.
      * Imprime el contenido del LinkedHashSet y verifica que se mantiene el orden de inserción.
      * */

      LinkedHashSet<String> animals = new LinkedHashSet<>();
      animals.add("Dog");
      animals.add("Cat");
      animals.add("Lion");
      animals.add("Tiger");
      animals.add("Bird");

      System.out.println(animals + "\n");


      /*
      * Ejercicio 2: Verificar elementos en el LinkedHashSet
      * Usa un metodo para comprobar si "Cat" está en el LinkedHashSet.
      * Imprime un mensaje dependiendo de si el elemento está presente o no.
      * */

      String searchAnimal = "Cat";
      System.out.println(animals.contains(searchAnimal) ?
         "The animal " + searchAnimal + " is in the collection.\n" :
         "The animal " + searchAnimal + " is not in the collection.\n");


      /*
      * Ejercicio 3: Eliminar elementos
      * Usa un metodo para eliminar un elemento de la colección.
      * Luego, imprime el conjunto resultante para verificar los cambios.
      * */

      animals.remove(searchAnimal);
      System.out.println(animals + "\n");


      /*
      * Ejercicio 4: Recorrer el LinkedHashSet
      * Usa un bucle for-each para recorrer la colección e imprimir cada elemento.
      * Usa un Iterator para recorrer el conjunto y eliminar todos los elementos que tengan más de tres caracteres.
      * */

      animals.forEach(System.out::println);
      Iterator<String> it = animals.iterator();

      while (it.hasNext())
         if (it.next().length() > 3)
            it.remove();

      System.out.println(animals + "\n");


      /*
      * Ejercicio 5: Comparación con otro conjunto
      * Declara dos LinkedHashSet<Integer> con diferentes valores numéricos.
      * Usa un metodo para encontrar la intersección entre ambos conjuntos.
      * Imprime el conjunto resultante con los elementos compartidos.
      * */

      LinkedHashSet<Integer> numbers1 = new LinkedHashSet<>();
      numbers1.add(1);
      numbers1.add(2);
      numbers1.add(3);
      numbers1.add(4);
      numbers1.add(5);

      LinkedHashSet<Integer> numbers2 = new LinkedHashSet<>();
      numbers2.add(1);
      numbers2.add(2);
      numbers2.add(3);
      numbers2.add(6);
      numbers2.add(7);

      numbers2.retainAll(numbers1);
      System.out.println(numbers2);
   }
}
