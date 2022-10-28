/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocherasjava;

import java.util.Scanner;

/**
 *
 * @author Grupo Copy Paste: Integrantes FRANCO MESAS, GIMENEZ ERNESTO MATIAS, JESICA VIOLA, LEILA BRITEZ NEIRA, LEONARDO SOLAN, SAMUEL LUCAS LIMACHI y SEBASTIAN VERGUECIO
 */
public class CocherasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el Dinero que tiene Guillermo:");
        int DineroGuillermo = Integer.parseInt(scanner.nextLine());
        
        var DineroLuis = DineroGuillermo / 2;
        var DineroJuan = (DineroGuillermo + DineroLuis) / 2;
        
        var TotalDinero = DineroGuillermo + DineroLuis + DineroJuan;
        
        
        
        System.out.println("DineroGuillermo = " + DineroGuillermo);
        System.out.println("DineroLuis = " + DineroLuis);        
        System.out.println("DineroJuan = " + DineroJuan);
        System.out.println("-------------------------------------------");
        System.out.println("El Total del Dinero que poseen los tres es= " + TotalDinero);
    }
    
}
