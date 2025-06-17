package com.w3schools.collection.map;

import java.util.HashMap;

public class StructureHashMap {
   public static void main(String[] args) {
      /*
      * Ejercicio 1: Crear y llenar un HashMap
      * Declara un HashMap<String, Integer> para almacenar nombres de estudiantes y sus edades.
      * Agrega al menos 5 estudiantes con sus respectivas edades.
      * Imprime el contenido del HashMap.
      * */

      HashMap<String, Integer> students = new HashMap<String, Integer>();
      students.put("Santiago", 19);
      students.put("Juan Carlos", 20);
      students.put("Marlon", 18);
      students.put("Josue", 21);
      students.put("Jose", 22);

      System.out.println(students + "\n");


      /*
      * Ejercicio 2: Acceder y modificar valores
      * Usando el HashMap del ejercicio anterior, obtén la edad de un estudiante específico.
      * Modifica la edad de un estudiante existente usando put().
      * Imprime el HashMap después de la modificación.
      * */
      String searchName = "Marlon";

      if (students.containsKey(searchName))
         System.out.println("The age of the student " + searchName + " is: " + students.get(searchName));
      else System.out.println("The student is not on the list.");

      students.put("Josue", 25);
      System.out.println(students + "\n");


      /*
      * Ejercicio 3: Eliminar elementos
      * Elimina a un estudiante del HashMap.
      * Verifica si un estudiante existe en el HashMap.
      * Imprime la lista después de la eliminación.
      * */

      students.remove(searchName);

      if (!students.containsKey(searchName))
         System.out.println("The student is not on the list.");

      System.out.println(students + "\n");


      /*
      * Ejercicio 4: Recorrer la colección
      * Usa un bucle for-each para imprimir todas las claves (nombres de estudiantes).
      * Usa otro for-each para imprimir todos los valores (edades de estudiantes).
      * Usa un for-each que imprima tanto las claves como los valores en formato "Nombre: Edad".
      * */

      for (String name : students.keySet())
         System.out.println(name);

      for (Integer value : students.values())
         System.out.println(value);

      for (String name : students.keySet())
         System.out.println("name: " + name + " age: " + students.get(name));



      /*
      * Ejercicio 5: Contar elementos y limpiar la colección
      * Usa el metodo para imprimir el número total de estudiantes en el HashMap.
      * Borra todos los elementos.
      * Imprime el HashMap después de vaciarlo.
      * */

      System.out.println("\nCount student on the colletion is: " + students.size());
      students.clear();
      System.out.println(students);
   }
}
