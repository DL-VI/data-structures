import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StructureLinkedList {
   public static void main(String[] args) {
      /*
      * Ejercicio 1: Crear y llenar una LinkedList
      * Declara una LinkedList<String> para almacenar nombres de libros.
      * Agrega al menos 5 nombres de libros a la lista.
      * Imprime todos los elementos de la lista.
      * */

      LinkedList<String> booksList = new LinkedList<String>(
         List.of("El extranjero", "Rebelion en la granja", "La metamorfosis", "Aura", "Pedro Paramo")
      );

      System.out.println(booksList + "\n");


      /*
      * Ejercicio 2: Acceder al primer y último elemento
      * Usando la LinkedList del ejercicio anterior, obtén el primer
      * y último elemento.
      * Imprime los valores obtenidos.
      * */

      System.out.println("First item: " + booksList.getFirst());
      System.out.println("Last item: " + booksList.getLast() + "\n");


      /*
      * Ejercicio 3: Insertar y eliminar elementos
      * Agrega un nuevo libro al inicio de la lista.
      * Agrega otro libro al final.
      * Elimina el primer libro.
      * Elimina el último libro.
      * Imprime la lista resultante.
      * */

      booksList.addFirst("La casa de Asterion");
      booksList.addLast("El principito");
      System.out.println(booksList);
      booksList.removeFirst();
      booksList.removeLast();
      System.out.println(booksList + "\n");


      /*
      * Ejercicio 4: Buscar y modificar elementos
      * Verifica si la lista contiene el libro "Aura".
      * Si existe, reemplázalo por "Colera".
      * Imprime la lista después de la modificación.
      * */

      if (booksList.contains("Aura")) {
         int index = booksList.indexOf("Aura");
         booksList.set(index, "Colera");
      }

      System.out.println(booksList + "\n");


      /*
      * Ejercicio 5: Recorrer la LinkedList con un Iterator
      * Declara una LinkedList<Integer> y almacena números del 1 al 10.
      * Usa un Iterator para recorrer la lista e imprimir solo los números impares.
      * Imprime el resultado.
      * */

      LinkedList<Integer> numbersList = new LinkedList<>(
         List.of(1,2,3,4,5,6,7,8,9,10)
      );

      Iterator<Integer> it = numbersList.iterator();

      while (it.hasNext()) {
         int num = it.next();
         if (num % 2 != 0)
            System.out.println(num);
      }
   }
}