/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastardo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class CasaTest {
    
    public CasaTest() {
    }

    /**
     * Test of comprar method, of class Casa.
//     */
//    @Test
//    public void testComprar() {
//        System.out.println("comprar");
//        Cosa cosa = null;
//        Casa instance = new Casa();
//        instance.comprar(cosa);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cantidadCosasCompradas method, of class Casa.
//     */
//    @Test
//    public void testCantidadCosasCompradas() {
//        System.out.println("cantidadCosasCompradas");
//        Casa instance = new Casa();
//        int expResult = 0;
//        int result = instance.cantidadCosasCompradas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tieneComida method, of class Casa.
//     */
//    @Test
//    public void testTieneComida() {
//        System.out.println("tieneComida");
//        Casa instance = new Casa();
//        boolean expResult = false;
//        boolean result = instance.tieneComida();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
    /**
     * Test of vieneDeEquiparse method, of class Casa.
     */
    @Test
    public void testVieneDeEquiparse() {
        System.out.println("vieneDeEquiparse");
        
        Casa instance = new Casa();
        Cosa a = new Cosa(10,true, true);
        Cosa b = new Cosa(10,true, true);
        Cosa c = new Cosa(1234510,false, true);
        instance.comprar(a); 
        instance.comprar(b);
        instance.comprar(c);
        
        assertEquals(true, instance.vieneDeEquiparse());
        
        
    }
//
//    /**
//     * Test of esDerrochona method, of class Casa.
//     */
//    @Test
//    public void testEsDerrochona() {
//        System.out.println("esDerrochona");
//        Casa instance = new Casa();
//        Double expResult = null;
//        Double result = instance.esDerrochona();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of compraMasCara method, of class Casa.
//     */
//    @Test
//    public void testCompraMasCara() {
//        System.out.println("compraMasCara");
//        Casa instance = new Casa();
//        Cosa expResult = null;
//        Cosa result = instance.compraMasCara();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of electrodomesticsComprados method, of class Casa.
//     */
//    @Test
//    public void testElectrodomesticosComprados() {
//        System.out.println("electrodomesticsComprados");
//        Casa instance = new Casa();
//        Cosa a = new Cosa(10,true, true);
//        Cosa b = new Cosa(10,true, true);
//        Cosa c = new Cosa(10,false, true);
//        instance.comprar(a); 
//        instance.comprar(b);
//        instance.comprar(c);
//        int expResult = 2;
//        int result = instance.electrodomesticosComprados().size();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//
//    /**
//     * Test of malaEpoca method, of class Casa.
//     */
//    @Test
//    public void testMalaEpoca() {
//        System.out.println("malaEpoca");
//        Casa instance = new Casa();
//        boolean expResult = false;
//        boolean result = instance.malaEpoca();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of queFaltaComprar method, of class Casa.
//     */
    @Test
    public void testQueFaltaComprar() {
        System.out.println("queFaltaComprar");
        
        List<Cosa> listaFalta = new ArrayList<>();
        
        Casa instance = new Casa();
        Cosa a = new Cosa(10,true, true);
        Cosa b = new Cosa(10,true, true);
        Cosa c = new Cosa(10,false, true);
        Cosa d = new Cosa(11,false, true);
        instance.comprar(a); 
        instance.comprar(b);
        instance.comprar(c);
        
        listaFalta.add(c);
        listaFalta.add(d);
        
        System.out.println(instance.cantidadCosasCompradas());
        
        List<Cosa> resultado = instance.queFaltaComprar(listaFalta);
        System.out.println(resultado);
        assertEquals(1, resultado.size());
    }

    /**
     * Test of faltaComida method, of class Casa.
     */
    @Test
    public void testFaltaComida() {
        System.out.println("faltaComida");
        
        Casa instance = new Casa();
        Cosa a = new Cosa(10,true, true);
        Cosa b = new Cosa(10,true, true);
        Cosa c = new Cosa(10,false, true);
        Cosa d = new Cosa(11,false, true);
        instance.comprar(a); 
        instance.comprar(b);
        instance.comprar(c);
        
        assertTrue(instance.faltaComida());
    }
    
    
}
