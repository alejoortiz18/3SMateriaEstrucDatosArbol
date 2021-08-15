/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import javax.swing.JOptionPane;

/**
 *
 * @author reisa
 */
public class Suscripcion {

   private String tipo;
   private double _fondo;

    public Suscripcion(String tipo) {
        if(tipo.equals("VIP")){
            this._fondo = 100000;
        }else{
            this._fondo = 50000;
        }
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getFondo() {
        return _fondo;
    }

    public void setFondo(double _fondo) {
        this._fondo = _fondo;
    }
    
}
