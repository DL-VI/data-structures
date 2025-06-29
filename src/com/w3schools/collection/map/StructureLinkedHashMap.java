package com.w3schools.collection.map;

import java.util.LinkedHashMap;

public class StructureLinkedHashMap {
   public static void main(String[] args) {
      /*
      * Ejercicio 1: Registrar ciudades y sus poblaciones
      * Crea un LinkedHashMap<String, Integer> para almacenar nombres de ciudades y su población.
      * Agrega al menos 5 ciudades.
      * Imprime el contenido del LinkedHashMap para comprobar que mantiene el orden.
      * */

      LinkedHashMap<String, Integer> capitalCities = new LinkedHashMap<>();
      capitalCities.put("Tokyo", 37_732_000);
      capitalCities.put("Nueva Delhi", 32_941_309);
      capitalCities.put("Shanghai", 29_210_808);
      capitalCities.put("Daca", 23_209_616);
      capitalCities.put("Sao Pablo", 22_619_736);

      System.out.println(capitalCities + "\n");


      /*
      * Ejercicio 2: Consultar y actualizar datos
      * Usa get() para obtener la población de una ciudad específica.
      * Modifica el valor de esa ciudad con put().
      * Muestra el nuevo contenido del mapa.
      * */

      String searchCity = "Daca";
      System.out.println(capitalCities.get(searchCity));
      System.out.println(capitalCities.put(searchCity, 22_281_442));
      System.out.println(capitalCities + "\n");


      /*
      * Ejercicio 3: Eliminar registros
      * Elimina una ciudad específica usando remove().
      * Verifica si otra ciudad existe usando containsKey().
      * Imprime el resultado actualizado del mapa.
      * */


      capitalCities.remove(searchCity);
      System.out.println(capitalCities.containsKey(searchCity) ?
         "The " + searchCity + " city is in the collection capitalCities." :
         "The " + searchCity + " city is not found in the collection capitalCities.");

      System.out.println(capitalCities + "\n");


      /*
      * Ejercicio 4: Recorrer el mapa completo
      * Recorre las claves con keySet() y muestra solo los nombres de las ciudades.
      * Recorre los valores con values() y muestra solo las poblaciones.
      * Recorre todos con entrySet() y muestra "Ciudad: Poblacion".
      * */

      capitalCities.keySet().forEach(System.out::println);
      capitalCities.values().forEach(System.out::println);

      capitalCities.forEach((city, poblation) -> {
         System.out.println(city + ": " + poblation);
      });


      /*
      * Ejercicio 5: Estadísticas básicas
      * Usa size() para saber cuántos registros hay.
      * Calcula la población total recorriendo los valores.
      * Usa clear() para vaciar completamente el mapa y verifica que esté vacío.
      * */

      System.out.println("\nThe number of elements in the collecion is: " + capitalCities.size());
      System.out.println("Total population in the collection capitalCities is: " + capitalCities.values().stream().mapToInt(Integer::intValue).sum());
   }
}
