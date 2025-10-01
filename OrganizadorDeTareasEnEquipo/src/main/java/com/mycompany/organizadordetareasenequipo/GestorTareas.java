/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.organizadordetareasenequipo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw2
 */
public class GestorTareas {

    private List<Tarea> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }
    
    public boolean agregarTarea(String descripcion){
        return tareas.add(new Tarea(descripcion));
    }
    
    public boolean completarTarea(int indice){
        if(indice>=0 && indice<tareas.size()){
        tareas.get(indice).marcarComoCompletada();
                return true;
    }
        return false;
    }
    
    public boolean eliminarTarea(int indice){
        if(indice>= 0 && indice < tareas.size()){
            tareas.remove(indice);
            return true;
        }
        return false;
    }
    
    public List<Tarea> listarTareas(){
        return tareas;
    }
}
