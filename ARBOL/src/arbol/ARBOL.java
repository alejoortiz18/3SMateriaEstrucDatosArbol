/*
 * Semestre 3
 * Profesor Andres Felipe Sanches
 * Estructura de datos
 * Taller de estructuras tipo Árbol
 * Alumno Rene Alejandro Ortiz Gaviria
 * 12 - 08 - 2021 
 */
package arbol;

import javax.swing.JOptionPane;

/**
 *
 * @author Rene Alejandro Ortiz Gaviria
 */
public class ARBOL {

    public static void main(String[] args) 
    {
        int cantidadSocios =6;
        Club club = new Club(cantidadSocios);
        boolean salir =false;
        while(!salir)
        {
                int opt = Integer.parseInt(JOptionPane.showInputDialog(null,"Desea ingresar un nuevo socio \n"
                + "1. Registrar un nuevo socio \n"
                + "2. datos socios \n"
                + "0. salir"));
        
            switch(opt){
                case 1:{
                    club.registrar();
                    break;
                }case 2:{
                   JOptionPane.showMessageDialog(null, club.verSocios());
                    break;
                }case 0:{
                    salir = true;
                }
            }
        }
        
    }
    
}
