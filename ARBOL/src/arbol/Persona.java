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
public class Persona {
   private String _Cedula;
   private String _Nombre;
   //private String _Suscrip;
   private Suscripcion _susc;

    public Persona(String suscripcion, String id) {
        this._Cedula = id; //JOptionPane.showInputDialog(null,"Ingrese Identificacion");
        this._Nombre = JOptionPane.showInputDialog(null,"Ingrese Nombre");
        //this._Suscrip = suscripcion;
        this._susc = new Suscripcion(suscripcion);
    }
   
    public String getCedula() {
        return _Cedula;
    }

    public void setCedula(String Cedula) {
        this._Cedula = Cedula;
    }

    public String getNombre() {
        return _Nombre;
    }

    public void setNombre(String Nombre) {
        this._Nombre = Nombre;
    }

    public Suscripcion getSusc() {
        return _susc ;
    }

//    public String getSuscrip() {
//        return _Suscrip;
//    }
//
//    public void setSuscrip(String Suscrip) {
//        this._Suscrip = Suscrip;
//    }
    public void setSusc(Suscripcion _susc) {
        this._susc = _susc;
    }

    @Override
    public String toString() {
        return "CC=" + _Cedula + ", Nombre=" + _Nombre + ", Suscripcion=" + _susc.getTipo()+", Fondo="+_susc.getFondo() ;
    }
   
}
