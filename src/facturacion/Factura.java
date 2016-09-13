/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacion;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author oscarquinteros
 */
public class Factura implements ComprobanteFiscal{
    private int numero;
    private Date fecha;
    private ItemFactura[] items = new ItemFactura[10];
    private Cliente cliente;
    private FormaPago formaPago;

    
    public Factura(int numero,Date fecha,Cliente cliente){
        this.numero=numero;
        this.fecha=fecha;
        this.cliente=cliente;
    }
    
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the formaPago
     */
    public FormaPago getFormaPago() {
        return formaPago;
    }

    /**
     * @param formaPago the formaPago to set
     */
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    /**
     * @return the items
     */
    public ItemFactura[] getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ItemFactura[] items) {
        this.items = items;
    }

    @Override
    public BigDecimal totalIVA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BigDecimal totalComprobante() {
        BigDecimal resultado= new BigDecimal(0.00);
        for (int i = 0; i < items.length; i++) {
            ItemFactura itemFactura = items[i];  
            resultado = resultado.add(itemFactura.subTotal());
        }
        return resultado;
    }
}
