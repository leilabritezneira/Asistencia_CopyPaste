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

        String[][] ArrayCocheras = new String[1000][4];

        menuPrincipal(ArrayCocheras);

    }

    // metodo menu principal

    public static void menuPrincipal(String[][] ArrayCocheras) {

        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // mostrar menu de opciones
        System.out.println("Bienvenido al sistema de gestión de cocheras");
        System.out.println("1. Español");
        System.out.println("2. English");
        System.out.println("3. Salir / Exit");
        System.out.println("------------------------------------------");

        System.out.println("Ingrese una opción / Choose a menu option: ");

        // leer la opcion ingresada por el usuario

        try (Scanner scanner = new Scanner(System.in)) {
            int opcion = 0;
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    int cocheras = cantidadCocheras();
                    menuEspañol(cocheras, ArrayCocheras);
                    break;
                case 2:
                    menuEnglish();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el sistema");
                    break;

                default:
                    // limpiar pantalla
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("------------------------------------------");
                    System.out.println(opcion + " No es una opción válida");
                    System.out.println("------------------------------------------");

                    // esperar 2 segundos
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // volver a mostrar el menu
                    menuPrincipal(ArrayCocheras);

            }
        } catch (Exception e) {
            System.out.println("ERROR: No es un caracter válido / Fin del programa");

        }

    }

    // Metodo para mostrar el menu en español
    public static void menuEspañol(int cocheras, String[][] ArrayCocheras) {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Bienvenido al sistema de gestión de cocheras");
        // int cantidadCocheras = cocheras;

        // menu de opciones
        System.out.println("1. Ingresar vehículo");
        System.out.println("2. Retirar vehículo");
        System.out.println("3. Listar Cocheras Dispobibles");
        System.out.println("4. Salir");

        System.out.println("Ingrese una opción: ");

        try (Scanner scanner = new Scanner(System.in)) {
            // leer la opcion ingresada por el usuario
            int opcion = scanner.nextInt();

            // dependiendo de la opcion elegida, ejecutar el codigo correspondiente
            switch (opcion) {
                case 1 -> ingresoVehiculo(cocheras, ArrayCocheras);
                case 2 -> menuEnglish();
                case 3 -> mostrarCocherasDisponibles(cocheras, ArrayCocheras);
                case 4 -> {
                    System.out.println("Gracias por utilizar el sistema");
                    break;
                }

                default -> {
                    System.out.println("Opción inválida");
                    // volver a mostrar el menu
                    menuEspañol(cocheras, ArrayCocheras);
                }

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

    public static void ingresoVehiculo(int cocheras, String[][] ArrayCocheras) {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Iniciar variable booleana para controlar el ingreso de vehiculos
        boolean cocheraLibre = false;

        // Para leer datos de entrada
        Scanner scanner = new Scanner(System.in);

        // Declara una array bidiemnsional de 5x5

        for (int i = 0; i < cocheras; i++) {

            System.out.println("Ingresado tipo de Auto");
            ArrayCocheras[i][0] = scanner.nextLine();

            System.out.println("Ingresado patente");
            ArrayCocheras[i][1] = scanner.nextLine();

            System.out.println("Ingresado fecha de ingreso");
            ArrayCocheras[i][2] = scanner.nextLine();

            System.out.println("Ingresado Hora  de ingreso");
            ArrayCocheras[i][3] = scanner.nextLine();

        }

        // imprimir la matriz de cocheras
        System.out.println("LOS DATOS INGRESADOS SON: ");
        for (int i = 0; i < cocheras; i++) {
            for (int j = 0; j < ArrayCocheras[i].length; j++) {
                System.out.print(ArrayCocheras[i][j] + " - ");
            }
            System.out.println("");
        }

        // pausar la ejecucion del programa

        System.out.println("Presione enter para continuar");
        scanner.nextLine();

        menuEspañol(cocheras, ArrayCocheras);

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
    public static void mostrarCocherasDisponibles(int cocheras, String[][] ArrayCocheras) {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // imprimir la matriz de cocheras
        System.out.println("LOS DATOS INGRESADOS SON: ");
        for (int i = 0; i < cocheras; i++) {
            for (int j = 0; j < ArrayCocheras[i].length; j++) {
                System.out.print(ArrayCocheras[i][j] + " - ");
            }
            System.out.println("");
        }

        // pausar la ejecucion del programa

        System.out.println("Presione enter para continuar");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        menuEspañol(cocheras, ArrayCocheras);
    }

}
