/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacion;

import java.math.BigDecimal;

/**
 *
 * @author oscarquinteros
 */
public class ProductoNoPerecedero extends Producto{
    
    public ProductoNoPerecedero(int stock,String codigo, String descripcion, BigDecimal precioUnitario){
        super(stock,codigo,descripcion,precioUnitario);
    }
}
