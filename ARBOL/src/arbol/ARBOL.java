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

    public static void main(String[] args) {
        // TODO code application logic here
         int opt = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar socio \n"
                    + "1. Si.  \n"
                    + "2. No."));

                
                switch (opt)
                {
                case 1:
                    JOptionPane.showMessageDialog(null, "No hay mas cupos para registro de usuarios VIP","Lo sentimos!!!...", JOptionPane.WARNING_MESSAGE);
                   
                    break;
                
                } 
        
        
        
        Persona persona = new Persona();
    }
    
}
