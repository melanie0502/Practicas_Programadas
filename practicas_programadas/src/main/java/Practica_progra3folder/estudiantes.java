
package Practica_progra3folder;
import javax.swing.JOptionPane;

/**
 *
 * @author Melany
 */
public class estudiantes {
    
    public String nombre;
    public String apellido;
    public int edad;
    public int carnet;
    public int nivel;
    
    public estudiantes() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.carnet = 0;
        this.nivel = 0;
    
    }
    
    public void agregarestudiante(){
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        mostrar(nombre);
       
    
    }
    
    public void mostrar(String nombre) {
        JOptionPane.showMessageDialog(null,""+nombre);
    }
    
}
