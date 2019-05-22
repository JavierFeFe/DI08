/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Calculando;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MDX01
 */
public class TestCalculando {
    private static Calculando calc;
    private static final double NUM1 = 12345.543;
    private static final double NUM2 = 66156.123;
    
    @Before
    public void setUp() {
        calc = new Calculando();
    }
    
    @Test
    public void testAdd(){
        //Prueba unitaria
        assertEquals("Método add incorrecto", (NUM1+NUM2), calc.add(NUM1, NUM2),0.0001);
    }
    @Test
    public void testSubtract(){
        //Prueba unitaria
        assertEquals("Método sustract incorrecto", (NUM1-NUM2), calc.subtract(NUM1, NUM2),0.0001);
    }
    @Test
    public void testMultiply(){
        //Prueba unitaria
        assertEquals("Método multiply incorrecto", (NUM1*NUM2), calc.multiply(NUM1, NUM2),0.0001);
    }
    @Test
    public void testDivide(){
        //Prueba unitaria
        assertEquals("Método divide incorrecto", (NUM1/NUM2), calc.divide(NUM1, NUM2),0.0001);
    }
    @Test
    public void testSistema(){
        //Prueba de sistema (quizá podría servir como prueba de regresión)
        double numeroFinal = ((153.23 + 225.45 - 124.37 )* 25.41 )/ 50.43;
        assertEquals("Prueba de Sistema fallida",numeroFinal, calc.divide(calc.multiply(calc.subtract(calc.add(153.23, 225.45),124.37),25.41),50.43),0.0001);
    }
    @Test
    public void testFuncional(){
        //Prueba de división entre 0 (En Java 8.0 
        if (calc.divide(56156165156.1234,0) == Double.POSITIVE_INFINITY){
            fail("Error de división entre 0");
        }
    }

    @After
    public void tearDown() {
        calc = null;
    }

    // Al no existir interrelación entre lós métodos de la clase Calculando no veo forma de hacer pruebas de integración ni de regresión
}
