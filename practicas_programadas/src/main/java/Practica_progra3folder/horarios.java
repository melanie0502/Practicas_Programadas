
package Practica_progra3folder;
import javax.swing.JOptionPane;

/**
 *
 * @author Melany
 */
public class horarios {
    
    public int hora;
    public String dia;
    public String modalidad;
    
   
    
    public horarios() {
        this.hora = 0;
        this.dia = "";
        this.modalidad = "";
        
    
    }
    
    public void agregardia(){
        dia = JOptionPane.showInputDialog("Digite el dia a matricular");
        mostrar(dia);
       
    
    }
    
    public void mostrar(String dia) {
        JOptionPane.showMessageDialog(null,""+dia);
    }
    
    
}
