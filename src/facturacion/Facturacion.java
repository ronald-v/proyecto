/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacion;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 *
 * @author oscarquinteros
 */
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar calendario = Calendar.getInstance();
        
        Cliente cliente = new ClienteComun();
        //Cliente cliente2 = new ClientePreferencial();
        
        ProductoNoPerecedero articulo1 = new ProductoNoPerecedero(10,"01","Ejemplo",new BigDecimal(10));
        ProductoNoPerecedero articulo2 = new ProductoNoPerecedero(10,"02","Ejemplo 2",new BigDecimal(20));
        
        
        Factura factura = new Factura(1,calendario.getTime(),cliente);
        
        
        ItemFactura item1 = new ItemFactura(articulo1, 2);
        ItemFactura item2 = new ItemFactura(articulo2, 1);
        
        System.out.println(item1.subTotal());
        
        
        
        factura.getItems()[0]=item1;
        factura.getItems()[1]=item2;
        
    }
    
}
