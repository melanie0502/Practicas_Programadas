
package Practica_progra3folder;
import javax.swing.JOptionPane;

/**
 *
 * @author Melany
 */
public class grupo { 
    public String grado;
    public String profe_cargo;
    public int espacios_disponibles;
    public int numero_grupo;
    
    
    public grupo() {
        this.grado = "";
        this.profe_cargo = "";
        this.espacios_disponibles = 0;
        this.numero_grupo = 0;
    
    }
    
    public void agregargrupo(){
         String grupoLec = JOptionPane.showInputDialog("Ingrese el número de grupo");
            int numero_grupo = Integer.parseInt(grupoLec);
        mostrar(numero_grupo);
       
    
    }
    
    public void mostrar(int numero_grupo) {
        JOptionPane.showMessageDialog(null,""+numero_grupo);
    }
    
    
}
