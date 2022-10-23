/*
Ejercicio 1:
Proyecto cajas -> Crear un proyecto según las especificaciones mostradas a continuación:
La formula es: volumen = ancho * alto * profundidad.
 */
package caja;

public class Caja { //Clase pública caja
    //Atributos (características):
    int ancho;
    int alto;
    int profundo;
    //Métodos y constructores (acciones):
    public Caja(){ //Constructor 1 = vacío   
    }
    //Constructor con parámetros:
    public Caja(int ancho, int alto, int profundo){ //Constructor 2 
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcularVolumen(){ //Método para calcular
        return ancho * alto * profundo;
    }
}
