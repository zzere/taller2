package taller_2;

/**
 *
 * @author sebas
 */
public class Calculadora {

    public static void main(String[] args) {
        //se instancia el objeto calculadora
        ObjetoCalculadora calculadora = new ObjetoCalculadora();
        
        calculadora.setNumero1();
        calculadora.setNumero2();
        
        calculadora.resultadoSuma();
        calculadora.resultadoResta();
        calculadora.resultadoMultiplicacion();
        calculadora.resultadoDivision();
    }

}
