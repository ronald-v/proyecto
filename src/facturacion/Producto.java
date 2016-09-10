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
public abstract class Producto extends Articulo{
    private int stock;
    
    public Producto (int stock,String codigo, String descripcion, BigDecimal precioUnitario){
        super(codigo,descripcion,precioUnitario);
        this.stock=stock;
        
    }
    
}
