
package Practica_progra3folder;
import javax.swing.JOptionPane;

/**
 *
 * @author Melany
 */
public class mensualidad {
    
    public int fecha;
    public String mes;
    public String estudiante;
    public int monto;
    public int carnet_estudiante;
   
    
    public mensualidad() {
        this.fecha = 0;
        this.mes = "";
        this.estudiante = "";
        this.monto = 0;
        this.carnet_estudiante = 0;
    
    }
    
    public void agregarmes(){
        mes = JOptionPane.showInputDialog("Digite el mes a cancelar");
        mostrar(mes);
       
    
    }
    
    public void mostrar(String mes) {
        JOptionPane.showMessageDialog(null,""+mes);
    }
    
}
