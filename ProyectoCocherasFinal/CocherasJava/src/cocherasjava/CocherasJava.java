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
 *         SAMUEL LUCAS LIMACHI y SEBASTIAN VERGUECIO.
 */
public class CocherasJava {

    /**
     * @param args the command line arguments
     * 
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
        System.out.print("Ingrese una opción / Choose a menu option: ");

        // leer la opcion ingresada por el usuario

        int opcion = 0;
        boolean opcionValida = false;
        while (!opcionValida) {
            try {
                Scanner sc = new Scanner(System.in);
                opcion = sc.nextInt();
                if (opcion >= 1 && opcion <= 3) {
                    opcionValida = true;
                    switch (opcion) {
                        case 1:
                            int cocheras = cantidadCocheras();
                            menuEspañol(cocheras, ArrayCocheras);
                            break;
                        case 2:
                            menuEnglish();
                            break;
                        case 3:
                            mensajeDespedida();
                            break;

                        default:
                            System.out.println("Opción inválida");
                            break;

                    }
                } else {
                    // Mensaje de error
                    opcionInvalida();
                    // Volver a mostrar el menu
                    menuPrincipal(ArrayCocheras);
                }
            } catch (Exception e) {
                // Mensaje de error
                opcionInvalida();
                // Volver a mostrar el menu
                menuPrincipal(ArrayCocheras);

            }
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
        System.out.println("------------------------------------------");
        System.out.print("Ingrese una opción: ");

        int opcion = 0;
        boolean opcionValida = false;
        while (!opcionValida) {
            try {
                Scanner sc = new Scanner(System.in);
                opcion = sc.nextInt();
                if (opcion >= 1 && opcion <= 4) {
                    opcionValida = true;
                    switch (opcion) {
                        case 1:
                            ingresoVehiculo(cocheras, ArrayCocheras);
                        case 2:
                            buscarVehiculo(cocheras, ArrayCocheras);
                        case 3:
                            mostrarCocherasDisponibles(cocheras, ArrayCocheras);
                        case 4:
                            mensajeDespedida();
                            break;

                        default:
                            System.out.println("Opción inválida");
                            // volver a mostrar el menu
                            menuEspañol(cocheras, ArrayCocheras);

                    }
                } else {
                    // Mensaje de error
                    opcionInvalida();

                    // volver a mostrar el menu
                    menuEspañol(cocheras, ArrayCocheras);
                }
            } catch (Exception e) {
                // Mensaje de error
                opcionInvalida();
                // Volver a mostrar el menu
                menuEspañol(cocheras, ArrayCocheras);

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

    // Metodo para ingresar vehiculoss
    public static void ingresoVehiculo(int cocheras, String[][] ArrayCocheras) {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Iniciar variable booleana para controlar el ingreso de vehiculos
        boolean cocheraLibre = false;
        int cocheraCarga = 0;

        // recorrer ArrayCocheras[0], verificar si es null
        for (int i = 0; i < cocheras; i++) {
            if (ArrayCocheras[i][0] == null) {

                cocheraLibre = true;
                cocheraCarga = i;
            }
        }
        System.out.println("Carga de Datos del Vehículo: ");
        System.out.println("------------------------------------------");

        // si cocherasLibre es true, mostrar mensaje de cochera libre
        if (cocheraLibre == true) {

            // ingresar datos en el array de cocheras disponibles
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Ingrese el tipo de vehículo: ");
                String tipoVehiculo = scanner.next();
                System.out.print("Ingrese la patente: ");
                String patente = scanner.next();
                System.out.print("Ingrese la Fecha Entrada: ");
                String fecha = scanner.next();
                System.out.print("Ingrese la Hora Entrada: ");
                String hora = scanner.next();

                // cargar datos en el array
                ArrayCocheras[cocheraCarga][0] = tipoVehiculo;
                ArrayCocheras[cocheraCarga][1] = patente;
                ArrayCocheras[cocheraCarga][2] = fecha;
                ArrayCocheras[cocheraCarga][3] = hora;

                // terminar el ingreso de vehiculos
                System.out.println("------------------------------------------");
                System.out.println("Vehículo ingresado correctamente");
                System.out.println("------------------------------------------");
                System.out.println("Presione una tecla para continuar");
                scanner.nextLine();
                scanner.nextLine();

                // volver al menu principal
                menuEspañol(cocheras, ArrayCocheras);
            }

        } else {
            // si no hay cocheras libres, mostrar mensaje de error
            System.out.println("No hay cocheras disponibles");
            System.out.println("Presione una tecla para continuar");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            // volver al menu principal
            menuEspañol(cocheras, ArrayCocheras);
        }
        menuEspañol(cocheras, ArrayCocheras);

    }

    // Metodo para verificare las cocheras disponibles.
    public static int cocherasDisponibles(int cocheras) {

        return cocheras + 10;
    }

    // metodo Solicita cantidad de cocheras disponibles
    public static int cantidadCocheras() {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.print("Ingrese la cantidad de cocheras disponibles: ");

        int cocheras = scanner.nextInt();

        return cocheras;
    }

    // metodo para mostrar la cantidad de cocheras disponibles
    public static void mostrarCocherasDisponibles(int cocheras, String[][] ArrayCocheras) {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // imprimir la matriz de cocheras

        System.out.println("------------------------------------------");
        System.out.println("         Tipo -  Patente -   Fecha -    Hora");
        System.out.println("------------------------------------------");

        for (int i = 0; i < cocheras; i++) {
            System.out.print("COCHERA " + (i + 1) + " :");
            for (int j = 0; j < ArrayCocheras[i].length; j++) {

                // verificar si el array es null
                if (ArrayCocheras[i][j] == null) {
                    System.out.print(" DISPONIBLE");
                    break;
                } else {
                    System.out.print(" " + ArrayCocheras[i][j] + " - ");
                }
                // System.out.print(ArrayCocheras[i][j] + " - ");
            }
            System.out.println("");
        }

        // pausar la ejecucion del programa
        System.out.println("------------------------------------------");
        System.out.println("Presione enter para continuar");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        menuEspañol(cocheras, ArrayCocheras);
    }

    // metodo para mostrar un mensaje de opcion invalida en el menu
    public static void opcionInvalida() {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // mostar mensaje de opcion invalida
        System.out.println("------------------------------------------");
        System.out.println("No es una opción válida");
        System.out.println("------------------------------------------");

        // esperar 2 segundos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void mensajeDespedida() {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("------------------------------------------");
        System.out.println("Gracias por utilizar el sistema");
        System.out.println("------------------------------------------");
    }

    // metodo para buscar un vehiculo por patente

    public static void buscarVehiculo(int cocheras, String[][] ArrayCocheras) {
        // limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // mostrar mensaje de busqueda de vehiculo
        System.out.println("------------------------------------------");
        System.out.println("Ingrese la patente del vehículo a buscar: ");
        System.out.println("------------------------------------------");

        // ingresar patente a buscar
        Scanner scanner = new Scanner(System.in);
        String patente = scanner.next();

        // recorrer el array de cocheras
        for (int i = 0; i < cocheras; i++) {
            if (ArrayCocheras[i][1] != null) {
                if (ArrayCocheras[i][1].equals(patente)) {
                    System.out.println("------------------------------------------");
                    System.out.println("Vehículo encontrado");
                    System.out.println("------------------------------------------");
                    System.out.println("Tipo: " + ArrayCocheras[i][0]);
                    System.out.println("Patente: " + ArrayCocheras[i][1]);
                    System.out.println("Fecha: " + ArrayCocheras[i][2]);
                    System.out.println("Hora: " + ArrayCocheras[i][3]);

                    // mensaje "Se procede a eliminar el vehiculo y liberar la cochera"
                    System.out.println("------------------------------------------");
                    System.out.println("Se procede a eliminar el vehiculo y liberar la cochera");
                    System.out.println("------------------------------------------");
                    // mensaje "Se procedera a cobrar el estacionamiento"
                    System.out.println("------------------------------------------");
                    System.out.println("Se procedera a cobrar el estacionamiento");
                    System.out.println("------------------------------------------");

                    // eliminar el vehiculo y liberar la cochera
                    ArrayCocheras[i][0] = null;
                    ArrayCocheras[i][1] = null;
                    ArrayCocheras[i][2] = null;
                    ArrayCocheras[i][3] = null;

                    // pausar la ejecucion del programa
                    System.out.println("------------------------------------------");
                    System.out.println("Presione enter para continuar");
                    scanner.nextLine();
                    scanner.nextLine();

                    menuEspañol(cocheras, ArrayCocheras);
                }
            }
        }

        // si no encuentra el vehiculo, mostrar mensaje de error
        System.out.println("------------------------------------------");
        System.out.println("No se encontró el vehículo");
        System.out.println("------------------------------------------");
        System.out.println("Presione enter para continuar");
        scanner.nextLine();
        scanner.nextLine();

        menuEspañol(cocheras, ArrayCocheras);
    }
}
