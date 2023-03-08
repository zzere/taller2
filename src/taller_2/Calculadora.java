package taller_2;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Calculadora {

    public static void main(String[] args) {
        //se instancia el objeto calculadora
        ObjetoCalculadora calculadora = new ObjetoCalculadora();
        
        calculadora.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 1")));
        calculadora.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 2")));
        //Se asignan valores a los atributos de la clase
        /*
        calculadora.numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 1"));
        calculadora.numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el Numero 2"));
        */
        //Se ejecutan las operaciones
        //Suma
        /*
        calculadora.resultado = calculadora.calcularSuma();
        JOptionPane.showMessageDialog(null, "Suma: " + calculadora.resultado);
        //Resta
        calculadora.resultado = calculadora.calcularResta();
        JOptionPane.showMessageDialog(null, "Resta: " + calculadora.resultado);
        //Multiplicacion
        calculadora.resultado = calculadora.calcularMultiplicacion();
        JOptionPane.showMessageDialog(null, "Multiplicación: " + calculadora.resultado);
        //División
        calculadora.resultado = calculadora.calcularDivision();
        JOptionPane.showMessageDialog(null, "División: " + calculadora.resultado);
        */
        calculadora.resultado();
    }

}
