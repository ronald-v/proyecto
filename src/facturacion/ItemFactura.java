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
 * @actualizacion:
 * Ronald Yesid Velasquez Mojica
 * Mayo del 2020
 */
class ItemFactura {
    private Articulo articulo;
    private int cantidad;
    
    
    public ItemFactura(Articulo articulo,int cantidad){
        this.articulo=articulo;
        this.cantidad=cantidad;
    }

    /**
     * @return the articulo
     */
    public Articulo getArticulo() {
        return articulo;
    }

    /**
     * @param articulo the articulo to set
     */
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public BigDecimal subTotal(){
      BigDecimal a = new BigDecimal(cantidad);  
      return a.multiply(articulo.getPrecioUnitario());   
    }
}
