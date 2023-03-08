
package taller_1;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Acirculo {
    
    private double resultado;
    private double radio;
    
    public void leer(){
        this.radio=Double.parseDouble(JOptionPane.showInputDialog("ingresa el radio"));
    
    }
    
    public void operar(){
        resultado= Math.PI*radio;
    }
    
    public String getresultado(){
        return "El area del circulo es: "+ resultado;
    }
}
