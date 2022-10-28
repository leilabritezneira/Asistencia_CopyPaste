/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocherasjava;

import java.util.Scanner;

/**
 *
 * @author Grupo Copy Paste: Integrantes FRANCO MESAS, GIMENEZ ERNESTO MATIAS, 
 * JESICA VIOLA, LEILA BRITEZ NEIRA, LEONARDO SOLAN, 
 * SAMUEL LUCAS LIMACHI y SEBASTIAN VERGUECIO
 */
public class CocherasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el Número de cocheras Disponibles:");
        int CocherasDisponibles = Integer.parseInt(scanner.nextLine());
        
        
              
        
        System.out.println("El total de cocheras Disponible es = " + CocherasDisponibles);
        
    }
    
}
