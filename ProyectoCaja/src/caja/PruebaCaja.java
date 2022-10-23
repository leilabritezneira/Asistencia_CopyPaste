/*
Ejercicio 1:
Proyecto cajas -> Crear un proyecto según las especificaciones mostradas a continuación:
La formula es: volumen = ancho * alto * profundidad.
 */
package caja;

public class PruebaCaja {
    public static void main(String[] args) { //Método main
        int medidaAncho = 3; //Valores ingresados por código duro
        int medidaAlto = 1;
        int medidaProf = 5; 
        
        Caja caja1 = new Caja(); //Instancia del objeto, constructor vacío.
        caja1.ancho = medidaAncho; //Le pasamos los valores al objeto
        caja1.alto = medidaAlto; 
        caja1.profundo = medidaProf;
        int resultado = caja1.calcularVolumen(); //Llamamos al método
        
        //Primer resultado: 
        System.out.println("Resultado del volumen de la caja 1 es: " + resultado);
        
        Caja caja2 = new Caja(2,4,6); //Llamamos al contructor 2 con nuevos argumentos
        //Llamamos con el nuevo objeto al método para un nuevo cálculo
        System.out.println("Resultado del volumen de la caja 2 es: " + caja2.calcularVolumen());
    }
}
