/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import javafx.util.Pair;
import javax.swing.JOptionPane;

/**
 *
 * @author reisa
 */
public class Club {
   private Persona[] socios;
   private int _cantSociosVIP;
   
    public Club(int cantidadSocios) {
        this.socios = new Persona[cantidadSocios];
        //this._cantSociosVIP = cantidadSocios;
    }
   
    public void registrar(){
        boolean salir = false;
        while(!salir)
        {
            String id = JOptionPane.showInputDialog(null, "ingrese la cedula o identificacion");
            Persona result = buscarPersonaPorCedula(id);

            String tipoSuscripcion="";

            if(result == null)
            {
                 for (int i = 0; i < socios.length; i++) 
                 {
                     if(socios[i] == null)
                     {
                         String susc = JOptionPane.showInputDialog(null, "ingrese tipo de suscripcion \n"
                                 + "1. VIP.\n"
                                 + "2. Regular");

                          switch (susc) 
                         {
                             case "1": 
                             {
                                 tipoSuscripcion ="VIP";
                                 break;
                             }
                              case "2": 
                             {
                                 tipoSuscripcion ="Regular";
                                 break;
                             }
                         } 

                         for (int j = 0; j < socios.length; j++)
                         {
                            if(socios[j] != null )
                            {
                                if(socios[j].getSusc().getTipo().equals(tipoSuscripcion)){
                                     _cantSociosVIP = _cantSociosVIP+1; 
                                }
                            } 
                         }

                         if(_cantSociosVIP==3 && tipoSuscripcion.equals("VIP"))
                         {
                             JOptionPane.showMessageDialog(null, "ya no hay mas cupos para socios VIP");
                             break;
                            // salir=true;
                         }else{
                             socios[i] = new Persona(tipoSuscripcion,id);
                             salir=true;
                             break;
                         }

                     }
                 }
             
             }else
             {
                 int continuar = Integer.parseInt(JOptionPane.showInputDialog(null, "La identificacion ya existe desea continuar? \n"
                         + "1. Si \n"
                         + "2. No"));
                 switch (continuar) 
                 {
                     case 1: 
                     {
                       break;
                     }
                      case 2: 
                     {
                       salir=true;
                       break;
                     }
                 } 
             }
            _cantSociosVIP =0;
        }
        
    }
    
    public Persona buscarPersonaPorCedula(String id){
        Persona encontrado = null;
        for (int i = 0; i < socios.length; i++) {
             if (socios[i] != null && socios[i].getCedula().equals(id)) {
                 encontrado = socios[i];
             }
         }
        return encontrado;
    }
   
    public String verSocios(){
        String socio = "";
        for (int i = 0; i < socios.length; i++) {
            if (socios[i] != null) {
                socio += (socios[i].toString() + "\n");
            }
        }
        return socio;
    }
}
