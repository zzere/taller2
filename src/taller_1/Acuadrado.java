
package taller_1;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Acuadrado {
    
    private double altura;
    private double base;
    private double resultado;
    
    
    public void leer(){
            this.altura=Double.parseDouble(JOptionPane.showInputDialog("ingresa la altura"));
        this.base=Double.parseDouble(JOptionPane.showInputDialog("ingresa la base"));
    }
    
    public void operar(){
        resultado=base*altura;
    }
    
    public String getresultado(){
        return "El area del cuadrado es: "+resultado;
    }
    
    
    
}
