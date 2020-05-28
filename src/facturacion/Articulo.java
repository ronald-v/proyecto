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
public abstract class Articulo {
    private String codigo;
    private String descripcion;
    private BigDecimal precioUnitario;
    private Impuesto[] impuestos[];    
    
    
    public Articulo(String codigo, String descripcion, BigDecimal precioUnitario){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precioUnitario=precioUnitario;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precioUnitario
     */
    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the impuestos
     */
    public Impuesto[][] getImpuesto() {
        return impuestos;
    }

    /**
     * @param impuestos the impuestos to set
     */
    public void setImpuesto(Impuesto[][] impuestos) {
        this.impuestos = impuestos;
    }
}
