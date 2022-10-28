/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocherasjava;

import java.util.Scanner;

/**
 *
 * @author Grupo Copy Paste: Integrantes FRANCO MESAS, GIMENEZ ERNESTO MATIAS,
 *         JESICA VIOLA, LEILA BRITEZ NEIRA, LEONARDO SOLAN,
 *         SAMUEL LUCAS LIMACHI y SEBASTIAN VERGUECIO
 */
public class CocherasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);

        // mostrar menu de opciones
        System.out.println("Bienvenido al sistema de gestión de cocheras");
        System.out.println("1. Español");
        System.out.println("2. English");
        System.out.println("3. Salir");
        System.out.println("------------------------------------------");

        System.out.println("Ingrese una opción / Choose a menu option: ");

        // leer la opcion ingresada por el usuario
        int opcion = scanner.nextInt();

        // dependiendo de la opcion elegida, ejecutar el codigo correspondiente

        switch (opcion) {
            case 1:
                menuEspañol(cantidadCocheras());
                break;
            case 2:
                menuEnglish();
                break;
            case 3:
                System.out.println("Gracias por utilizar el sistema");
                break;

            default:
                System.out.println("Opción inválida");
                // volver a mostrar el menu
                main(args);

        }

    }

    // Metodo para mostrar el menu en español
    public static void menuEspañol(int cocheras) {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestión de cocheras");
        int cantidadCocheras = cocheras;

        // menu de opciones
        System.out.println("1. Ingresar vehículo");
        System.out.println("2. Retirar vehículo");
        System.out.println("3. Listar Cocheras Dispobibles");
        System.out.println("4. Salir");

        System.out.println("Ingrese una opción: ");

        // leer la opcion ingresada por el usuario
        int opcion = scanner.nextInt();

        // dependiendo de la opcion elegida, ejecutar el codigo correspondiente
        switch (opcion) {
            case 1 -> ingresoVehiculo();
            case 2 -> menuEnglish();
            case 3 -> mostrarCocherasDisponibles(cocheras);
            case 4 -> {
                System.out.println("Gracias por utilizar el sistema");
                break;
            }

            default -> {
                System.out.println("Opción inválida");
                // volver a mostrar el menu
                menuEspañol(cantidadCocheras);
            }

        }

    }

    // Metodo para mostrar el menu en ingles
    public static void menuEnglish() {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Welcome to the parking management system");
        System.out.println("1. Remove vehicle");
        System.out.println("2. List vehicles");
        System.out.println("3. Exit");
    }

    // Metodo para ingresar vehiculos

    public static void ingresoVehiculo() {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("estoy en el ingreso de vehiculo");
    }

    // Metodo para verificare las cocheras disponibles

    public static int cocherasDisponibles(int cocheras) {

        return cocheras + 10;
    }

    // metodo Solicita cantidad de cocheras disponibles

    public static int cantidadCocheras() {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de cocheras disponibles: ");
        int cocheras = scanner.nextInt();

        return cocheras;
    }

    // metodo para mostrar la cantidad de cocheras disponibles

    public static void mostrarCocherasDisponibles(int cocheras) {

        int cocherasDisponibles = cocheras + 10;

        System.out.println("La cantidad de cocheras disponibles es: " + cocherasDisponibles);

        // para continuar presione enter
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione enter para continuar");
        scanner.nextLine();

        menuEspañol(cocherasDisponibles);
    }

}
