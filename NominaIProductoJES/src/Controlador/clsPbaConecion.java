/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.clsConexion;

/**
 *
 * @author jorsalda
 */
public class clsPbaConecion {
     public static void main(String[] args) {
      
        clsConexion obj=new clsConexion();
        if(obj.getConexion()!=null)
            System.out.println("conexión Conrrecta");
        else
        System.out.println("no hay conexión ");    
    }
}
