package taller_2;

/**
 *
 * @author sebas
 */
public class ObjetoCalculadora {
    //atrivutos de la clase

    public int numero1;
    public int numero2;
    public int resultado;
    //metodo constructor

    public ObjetoCalculadora() {
        super();
    }

    //metodos de operaciones
    public int calcularSuma() {
        resultado = 0;
        resultado = numero1 + numero2;
        return (resultado);
    }

    public int calcularResta() {
        resultado = 0;
        resultado = numero1 - numero2;
        return (resultado);
    }

    public int calcularMultiplicacion() {
        resultado = 0;
        resultado = numero1 * numero2;
        return (resultado);
    }

    public int calcularDivision() {
        resultado = 0;
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        }
        return (resultado);
    }

}
