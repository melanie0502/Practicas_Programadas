
package com.mycompany.practicas_programadas;
import javax.swing.JOptionPane;

/**
 *
 * @author Melany
 */
public class practica_progra1 { public static void main(String[] args) {
        System.out.println("Hello World!");
   
        /*PRIMER EJERCICIO*/
        
    String mes;
    int numero;
    
    String numeroLectura =JOptionPane.showInputDialog("Ingrese un numero del 1-12: ");
    numero = Integer.parseInt(numeroLectura);
    
    if (numero == 1) {
    System.out.println ("Pertenece al mes Enero");}
    else if (numero == 2) {
    System.out.println ("Pertenece al mes Febrero");}
    else if (numero == 3) {
    System.out.println ("Pertenece al mes Marzo");}
    else if (numero == 4) {
    System.out.println ("Pertenece al mes Abril");}
    else if (numero == 5) {
    System.out.println ("Pertenece al mes Mayo");}
    else if (numero == 6) {
    System.out.println ("Pertenece al mes Junio");}
    else if (numero == 7) {
    System.out.println ("Pertenece al mes Julio");}
    else if (numero == 8) {
    System.out.println ("Pertenece al mes Agosto");}
    else if (numero == 9) {
    System.out.println ("Pertenece al mes Septiembre");}
    else if (numero == 10) {
    System.out.println ("Pertenece al mes Octubre");}
    else if (numero == 11) {
    System.out.println ("Pertenece al mes Noviembre");}
    else if (numero == 12) {
    System.out.println ("Pertenece al mes Diciembre");}
    
    if (numero == 1 || numero == 2 || numero == 3 || numero == 4) {
    System.out.println ("Pertenece al primer cuatrimestre");}
    else if (numero == 5 || numero == 6 || numero == 7 || numero == 8) {
    System.out.println ("Pertenece al segundo cuatrimestre");}
    else if (numero == 9 || numero == 10 || numero == 11 || numero == 12) {
    System.out.println ("Pertenece al tercer cuatrimestre");}
     
    } 
    /*SEGUNDO EJERCICIO*/
    {
        int edad;
    
    String edadLectura =JOptionPane.showInputDialog("Ingrese su edad: ");
    edad = Integer.parseInt(edadLectura);
    
    if (edad <= 5) {
    System.out.println ("Pertenece a primera infancia");}
    else if (edad > 5 && edad <= 11) {
    System.out.println ("Pertenece a Infancia");}
    else if (edad >= 12 && edad <= 18) {
    System.out.println ("Pertenece a Adolescencia");}
    else if (edad >= 19 && edad <= 30) {
    System.out.println ("Pertenece a Juventud");}
    else if (edad >= 31 && edad <= 59) {
    System.out.println ("Pertenece a Adultez");}
    else if (edad >= 60) {
    System.out.println ("Pertenece a Persona Mayor");}
    } 
    
               
    
}
    

