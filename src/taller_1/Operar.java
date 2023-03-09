
package taller_1;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Operar {
    
    private double altura;
    private double base; 
    private double radio; 
    private double resultado1;
    private double resultado2;
    
    
    public void leer(){
        this.radio=Double.parseDouble(JOptionPane.showInputDialog("ingresa el radio"));
        this.base=Double.parseDouble(JOptionPane.showInputDialog("ingresa la base"));
        this.altura=Double.parseDouble(JOptionPane.showInputDialog("ingresa la altura"));
    }
    
    public void resultado(){
        resultado1=base*altura;
        resultado2=Math.PI*radio;
    }
    
    public String mostrarR(){
        return "el area del cuadrado es: "+resultado1+"\nel area del circulo es: "+resultado2;
    }
    
}
