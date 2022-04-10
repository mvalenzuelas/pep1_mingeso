package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Una clase que implementa la inteface OperationStrategy para concretar la estrategia de la intersección de dos listas
 * de enteros
 */
public class ConcreteInter implements OperationStrategy{

    /**
     * Metodo que implementa el metodo execute de la interace OperationStrategy concretado la operación de la
     * intersección de dos listas de enteros. La intersección de numeros interos corresponde al conjunto formado por los
     * elementos que comparten (elementos iguales ) dos conjuntos numericos.
     * @param a una List<Integer> o lista de enteros que contiene valores no repetidos; puede representar un conjunto
     *          numerico. Es el primer operando de la operación en la intersección de conjunto.
     * @param b una List<Integer> o lista de enteros que contiene valores no repetidos; puede representar un conjunto
     *          numerico. Es el segundo operando de la operación en la intersección de conjunto.
     * @return Retorna el conjunto formado por la interseccion de las listas de enteros a y b
     */
    public List<Integer> execute(List<Integer> a, List<Integer> b) {
        List<Integer> c = new ArrayList<Integer>();
        for (int aElement : a) {
            if (b.contains(aElement) && !c.contains(aElement)) {
                c.add(aElement);
            }
        }
        return c;
    }

}
