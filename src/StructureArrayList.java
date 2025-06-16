import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StructureArrayList {
   public static void main(String[] args) {
      /*
       * Ejercicio 1: Crear y llenar una lista
       *
       * Agregar al menos 5 nombres de frutas a la lista.
       * Imprimir todos los elementos de la lista.
       * */

      ArrayList<String> fruitList = new ArrayList<>();
      fruitList.add("Orange");
      fruitList.add("Pear");
      fruitList.add("Apple");
      fruitList.add("Coco");
      fruitList.add("Grape");

      System.out.println(fruitList);


      /*
       * Ejercicio 2:
       *
       * Verificar si la lista anterior contiene la fruta "Apple"
       * Si esta presente, imprime su posicion en la lista.
       * Si no esta presente, imprime un mensaje indicando que no se encontró
       * */

      if (fruitList.contains("Apple")) {
         int index = fruitList.indexOf("Apple");
         System.out.printf("\nThe position of Apple in the list is %d.", (index+1));

         // Cambiamos la fruta para que se cumpla la ultima condicion.
         fruitList.set(index, "Banana");
      }

      if (!fruitList.contains("Apple")) System.out.println("\nThe apple fruit not found.");
      System.out.println(fruitList + "\n");


      /*
      * Ejercicio 3: Eliminar elementos
      *
      * Crea un ArrayList que almacene números enteros.
      * Agrega los números del 1 al 10.
      * Elimina todos los números pares de la lista.
      * Imprime la lista resultante.
      * */

      ArrayList<Integer> numberList = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
      //Iterator<Integer> it = numberList.iterator();

      numberList.removeIf(integer -> integer % 2 == 0);

      /*while (it.hasNext())
         if (it.next() % 2 == 0)
            it.remove();
      */
      System.out.println(numberList + "\n");


      /*
      * Ejercicio 4: Ordenar elementos
      * Crea un ArrayList que almacene nombres de ciudades.
      * Agrega al menos 5 nombres de ciudades a la lista.
      * Ordena la lista alfabéticamente usando Collections.sort().
      * Imprime la lista ordenada.
      * */

      ArrayList<String> cityList = new ArrayList<>(List.of("New York","Berlin","Madrid","Paris","Milan"));
      System.out.println(cityList);
      Collections.sort(cityList);
      System.out.println(cityList + "\n");


      /*
      * Ejercicio 5: Convertir a un arreglo
      * Crea un ArrayList que almacene números decimales.
      * Agrega al menos 5 números decimales a la lista.
      * Convierte el ArrayList a un arreglo usando el metodo toArray().
      * Imprime el contenido del arreglo.
      * */

      ArrayList<Double> decimalList = new ArrayList<>(List.of(1.1, 2.2, 3.3, 4.4, 5.5));
      System.out.println(decimalList);
      Double[] array = decimalList.toArray(new Double[0]);

      // Output of array
      for (Double element : array) System.out.println(element);
   }
}