package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la interface OperationStrategy para concretar la estrategia de la resta de conjuntos
 */

public class ConcreteLess implements OperationStrategy {
    /**
     * Metodo que impleta execute de la inteface OpertaionStrategy para concretar la estrategia de la resta de dos
     * conjuntos numericos representados por listas de enteros List<Integer>. La resta de dos conjuntos numericos
     * un tercer conjunto el cual contiene todos los elementos del primer conjunto con exepción los que se encuentren en
     * el segundo conjunto nuemerico
     * @param a List<integer> o lista de enteros que puede representa un conjunto de numeros enteros que corresponde al
     *          primer operando de la resta de conjuntos
     * @param b List<integer> o lista de enteros que puede representa un conjunto de numeros enteros que corresponde al
     *          segundo operando de la resta de conjuntos
     * @return Retorna una List<Integer> o lista de entero que representa al subconjunto generado tras restar los
     * conjuntos a y b
     */
    @Override
    public List<Integer> execute(List<Integer> a, List<Integer> b) {
        //Crear conjunto final
        List<Integer> c=new ArrayList<>();


        for (int aElement: a){
            //Agrgar todos los elementos de la lista a a menos que este elemento se encuentre en la lista b
            if (!b.contains(aElement)){
                c.add(aElement);
            }
        }
        return c;
    }
}
