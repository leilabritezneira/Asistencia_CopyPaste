// pedir un nro y calcular su factorial, hacerlo con las 2 clases, Scanner  JptionPAne
package ciclos12;

import javax.swing.JOptionPane;

public class Ciclos12 {

    public static void main(String[] args) {
        long factorial = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un nro:"));
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial del nro ingresado es: "+factorial);
    

    }
}
