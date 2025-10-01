/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.organizadordetareasenequipo.GestorTareas;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author daw2
 */
public class GestorTareasTest {
    
    public GestorTareasTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   @Test
    public void testAgregarTarea() {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea("Tarea de prueba");

        assertEquals(1, gestor.listarTareas().size(), "La tarea debería haberse agregado");
    }

    @Test
    public void testCompletarTarea() {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea("Tarea pendiente");

        boolean resultado = gestor.completarTarea(0);

        assertTrue(resultado, "La tarea debería haberse completado");
        assertTrue(gestor.listarTareas().get(0).isCompletada(), "El estado debería ser completada");
    }

    @Test
    public void testEliminarTarea() {
        GestorTareas gestor = new GestorTareas();
        gestor.agregarTarea("Tarea a eliminar");

        boolean resultado = gestor.eliminarTarea(0);

        assertTrue(resultado, "La tarea debería haberse eliminado");
        assertEquals(0, gestor.listarTareas().size(), "La lista debería estar vacía");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
