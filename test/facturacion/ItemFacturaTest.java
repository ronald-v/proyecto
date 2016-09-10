/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacion;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oscarquinteros
 */
public class ItemFacturaTest {
    
    public ItemFacturaTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void verficarSubTotalItemFactura() {
    
      ProductoNoPerecedero articulo1 = new ProductoNoPerecedero(10,"01","Ejemplo",new BigDecimal(10));
      ItemFactura item1 = new ItemFactura(articulo1, 2);
      
      BigDecimal resultado = item1.subTotal();
      
      assertEquals(resultado, new BigDecimal(21));
      
    
    }
}
