/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.organizadordetareasenequipo;

import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class OrganizadorDeTareasEnEquipo {

    public static void main(String[] args) {
      GestorTareas gestor = new GestorTareas();
      Scanner teclado = new Scanner(System.in);
      int opcion;
      
      do{
          System.out.println("\n--- Gestor de tareas ---");
          System.out.println("1. Agregar tarea");
          System.out.println("2. Completar tarea");
          System.out.println("3. Eliminar tarea");
          System.out.println("4. Listar tarea");
          System.out.println("5. Salir del programa");
          System.out.println("Seleccione una opcion");
          opcion = teclado.nextInt();
          
          switch(opcion){
              case 1 ->{
                  System.out.println("Descripcion de la tarae");
                  String descripcion = teclado.nextLine();
                  gestor.agregarTarea(descripcion);
                  System.out.println("Tarea guardada correctamente");
              }
              case 2 ->{
                  System.out.println("Numero de tarea a completar");
                  int indice = teclado.nextInt();
                  if(gestor.completarTarea(indice - 1)){
                      System.out.println("Tarea completada");
                  }else{
                      System.out.println("Tarea no encontrada");
                  }
              }
              case 3 ->{
                  System.out.println("Numero de tarea a eliminar");
                  int indice = teclado.nextInt();
                  if(gestor.eliminarTarea(indice - 1)){
                      System.out.println("Tarea eliminada");
                  }else{
                      System.out.println("Tarea no encontrada");
                  }
              }
              case 4 ->{
                  System.out.println("Lista de tareas"); 
                  int i = 1;
                 for (Tarea t : gestor.listarTareas()) {
                        System.out.println((i++) + ". " + t);
                    } 
              }
              case 5 -> System.out.println("Saliendo del programa");
              default -> System.out.println("Opcion no valida");
          }
      }while(opcion !=5);
      teclado.close();
    }
}
