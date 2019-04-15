
package NominaProducto;

import Controlador.ctrProducto;
import Modelo.clsConsultarPrd;


import Modelo.clsProducto;

import Vista.frmProduto;


public class NominaProducto {

   
    public static void main(String[] args) {
        clsProducto objPro= new clsProducto();
        clsConsultarPrd objConPro= new clsConsultarPrd();
        frmProduto frmPro=new frmProduto();
        ctrProducto crtl=new ctrProducto(objPro,objConPro,frmPro);
        crtl.iniciar();
        frmPro.setVisible(true);
    }
        
}
