/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentdd;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando
 */
public class ExamenTDDTest {
    ExamenTDD operacion;
    public ExamenTDDTest() {
        operacion= new ExamenTDD();
    }
    
   
    @Test
    public void pregunta_1(){ 
            String resultado =operacion.obtenerAccion(true);
            assertEquals("yamatriculado",resultado);
    }
    
}
