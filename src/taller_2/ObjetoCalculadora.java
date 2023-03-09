package taller_2;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class ObjetoCalculadora {
    //atributos de la clase

    private int numero1;
    private int numero2;
    private int resultado;
    //metodo constructor

    public ObjetoCalculadora() {
        resultado = 0;
    }
    
    //metodos para operar los numeros ingresados
    private int calcularSuma() {
        return (resultado = numero1 + numero2);
    }

    private int calcularResta() {
        return (resultado = numero1 - numero2);
    }

    private int calcularMultiplicacion() {
        return (resultado = numero1 * numero2);
    }

    private int calcularDivision() {
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        }
        return (resultado);
    }

    public void setNumero1() {
        do{
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite numero 1"));
        }while(numero1<=0);
    }

    public void setNumero2() {
       do{
           numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite numero 2"));
       }while(numero2<=0);
    }
    
    
    public void resultadoSuma(){
       JOptionPane.showMessageDialog(null, "suma: "+ calcularSuma());
    }
    
    public void resultadoResta(){
         JOptionPane.showMessageDialog(null, "resta: "+ calcularResta());
    }
    public void resultadoMultiplicacion(){
        JOptionPane.showMessageDialog(null, "multiplicacion: "+ calcularMultiplicacion());
    }
    public void resultadoDivision(){
        JOptionPane.showMessageDialog(null, "division: "+ calcularDivision());
    }
}
