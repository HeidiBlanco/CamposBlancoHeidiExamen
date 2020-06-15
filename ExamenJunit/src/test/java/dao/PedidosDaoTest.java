/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author heidi
 */
public class PedidosDaoTest {
    PedidosDao instance;
public PedidosDaoTest() {
instance= new PedidosDao();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConexion method, of class PedidosDao.
     */
    @Test
    public void testGetConexion() {
        System.out.println("getConexion");
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     @Test
    public void testListar() {
        System.out.println("listar");
        Integer posicion = 10;
        ArrayList<Pedido> expResult = null;
        ArrayList<Pedido> result = instance.listar(posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PedidosDao.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        Integer id = 10248;
         Pedido expResult = new Pedido(10248,90,5,1996-07-04,1996-08-01,1996-07-16,3,"232.3800","Wilman Kala","Keskuskatu 45","Helsinki","NULL","21240","Finlandia");
           Pedido Result2 = instance.read(id);
        assertEquals(Result2.getId(),expResult.getId());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 @Test
    public void testInsert() {
        System.out.println("insert");
        Pedido pedido = new Pedido(4000,152358,1111,1996-07-09,1996-08-08,1996-07-25,199,498542,"Alex","calle avenida olimpica","Madrid","Madrid","28011","España");
        PedidosDao instance = new PedidosDao();
        Integer expResult = null;
        Integer result = instance.insert(pedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        Pedido pedido = new Pedido(10248,90,5,1996-07-04,1996-08-01,1996-07-16,3,"232.3800","Wilman Kala","Keskuskatu 45","Helsinki","NULL","21240","Finlandia");
        Integer expResult = null;
        Integer result = instance.update(pedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    //BORRADO DE RESGISTROS
    @Test
     public void testDelete() {
        System.out.println("delete");
        Integer idPedido = 1;
         boolean expResult = false;
        Integer result = instance.delete(idPedido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
