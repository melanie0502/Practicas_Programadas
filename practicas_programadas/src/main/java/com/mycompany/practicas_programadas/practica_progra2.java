
package com.mycompany.practicas_programadas;
import javax.swing.JOptionPane;


/**
 *
 * @author Melany
 */
public class practica_progra2  { public static void main(String[] args) {
        System.out.println("Hello World!"); 

    
    
    /*PRIMER EJERCICIO*/
    
    int promedio_pits = 0;
    int porcentaje = 0; 
    int promedio_vuelta = 0;

     for (int i = 1; i<= 10; i++) {
            String tiempo_vueltaLec = JOptionPane.showInputDialog("Ingrese el tiempo por vuelta");
            int tiempo_vuelta = Integer.parseInt(tiempo_vueltaLec);
            promedio_vuelta = promedio_vuelta+tiempo_vuelta;
     }
     
    
          
        
    
    for (int k = 1; k<= 10; k++) {
            String tiempo_pitsLec = JOptionPane.showInputDialog("Ingrese el tiempo por PITS");
            int tiempo_pits = Integer.parseInt(tiempo_pitsLec);
            promedio_pits = promedio_pits+tiempo_pits;
            porcentaje = promedio_pits/promedio_vuelta*100;
    }

           
    System.out.println("El tiempo promedio por vuelta es: " +promedio_vuelta/10);
    System.out.println("El tiempo promedio por PITS es: "+promedio_pits/10);
    System.out.println("El tiempo promedio por vuelta es: " + porcentaje);
     

/*     /*SEGUNDO EJERCICIO*/
     int cantidadniños;
        String cantidadniñosLec = JOptionPane.showInputDialog("Ingrese la cantidad de niños");
        cantidadniños = Integer.parseInt(cantidadniñosLec);
        
        int menos_100 = 0;
        int e100_120 = 0;
        int e121_130 = 0;
        int e131_140 = 0;
        int mas140 = 0;
        int promedio = 0;
        
        
        
        
        for (int k = 1; k <= cantidadniños; k++) {
            String estaturaLectura = JOptionPane.showInputDialog("Ingrese la estatura");
            int estatura = Integer.parseInt(estaturaLectura);
            promedio = promedio+estatura;
            
            if (estatura < 100) {
                menos_100 = menos_100+1;
            }
            if (estatura >= 100 && estatura <= 120) {
                e100_120 = e100_120+1;
            }
            if (estatura >= 121 && estatura <= 130) {
                e121_130 = e121_130+1;
            }
            if (estatura >= 131 && estatura <= 140) {
                e131_140 = e131_140+1;
            }
            if (estatura > 140) {
                mas140 = mas140+1;
            }
            
        
            
        
 
    }
        System.out.println("La cantidad de niños que miden menos de 100cm es: " + menos_100);
        System.out.println("La cantidad de niños que miden entre 100cm y 120cm: " + e100_120);
        System.out.println("La cantidad de niños que miden entre 121cm y 130cm: " + e121_130);
        System.out.println("La cantidad de niños que miden entre 131cm y 140cm: " + e131_140);
        System.out.println("La cantidad de niños que miden más de 140cm: " + mas140);
        System.out.println("El promedio de estaturas es de: "+promedio/cantidadniños); 
        
    
}   

}
