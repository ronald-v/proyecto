/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacion;

import java.util.Date;

/**
 *
 * @author oscarquinteros
 */
public class Factura {
    private int numero;
    private Date fecha;
    private Articulo[] articulos[];
    private Cliente cliente;
    private FormaPago formaPago;
}
