/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facturacion;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author oscarquinteros
 */
public class LibroIVAVenta {
    private ArrayList<ComprobanteFiscal> comprobantes;

    
    public BigDecimal totalVenta(){
        BigDecimal resultado = new BigDecimal(0.00);
        for (ComprobanteFiscal comprobanteFiscal : comprobantes) {
            resultado=resultado.add(comprobanteFiscal.totalComprobante());
        }
        return resultado;
    }
    
    public BigDecimal totalIVA(){
        BigDecimal resultado = new BigDecimal(0.00);
        for (ComprobanteFiscal comprobanteFiscal : comprobantes) {
            resultado=resultado.add(comprobanteFiscal.totalIVA());
        }
        return resultado;          
    }
    
    
    /**
     * @return the facturas
     */
    public ArrayList getComprobantes() {
        return comprobantes;
    }

    /**
     * @param facturas the facturas to set
     */
    public void setComprobantes(ArrayList comprobantes) {
        this.comprobantes = comprobantes;
    }
    
    
}
