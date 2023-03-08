package taller_2;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class ObjetoCalculadora {
    //atrivutos de la clase

    private int numero1;
    private int numero2;
    private int resultado;
    //metodo constructor

    public ObjetoCalculadora() {
        //resultado = 0;
    }
    
    //metodos para operar los numeros ingresados
    public int calcularSuma() {
        return (resultado = numero1 + numero2);
    }

    public int calcularResta() {
        return (resultado = numero1 - numero2);
    }

    public int calcularMultiplicacion() {
        return (resultado = numero1 * numero2);
    }

    public int calcularDivision() {
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        }
        return (resultado);
    }

    public void setNumero1(int numero1) {
        if (numero1>0){
            this.numero1 = numero1;
        }
    }

    public void setNumero2(int numero2) {
        if (numero2>0){
            this.numero2 = numero2;
        }
    }
    
    
    public void resultado(){
       JOptionPane.showMessageDialog(null, "suma: "+ calcularSuma());
       JOptionPane.showMessageDialog(null, "resta: "+ calcularResta());
       JOptionPane.showMessageDialog(null, "multiplicacion: "+ calcularMultiplicacion());
       JOptionPane.showMessageDialog(null, "division: "+ calcularDivision());
    }
}
