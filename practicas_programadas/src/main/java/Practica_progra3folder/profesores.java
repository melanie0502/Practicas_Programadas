
package Practica_progra3folder;
import javax.swing.JOptionPane;

/**
 *
 * @author Melany
 */
public class profesores {
     public String nombre;
    public String apellido;
    public int cedula;
    public int numero_profesor;
    public String materia;
    
    public profesores() {
        this.nombre = "";
        this.apellido = "";
        this.cedula = 0;
        this.numero_profesor = 0;
        this.materia = "";
    
    }
    
    public void agregarprofesor(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor");
        mostrar(nombre);
       
    
    }
    
    public void mostrar(String nombre) {
        JOptionPane.showMessageDialog(null,""+nombre);
    }
    
}
