package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Una clase que implementa el metodo execute de la interface OperationStrategy para concretar la estrategia union
 */
public class ConcreteUnion implements OperationStrategy {
    /**
     * Un metodo que implementa el metodo execute de la inteface OperationStrategy para concretar la estrategia de la
     * union de dos listas de enteros o List<Integer>. La union de dos listas de numeros enteros consiste en la creación
     * de un conjunto que contiene todos los elementos de dos conjuntos nuemericos sin repetición
     * @param a Una List<Integer> o lista de enteros que puede tambien representar un conjunto numerico,además
     *          corresponde al primer operndo de la Union
     * @param b Una List<Integer> o lista de enteros que puede tambien representar un conjunto numerico,además
     *          corresponde al segundo operndo de la Union
     * @return Retorna una List<Integer> o lista de enteros que contiene la union de las listas de enteros a y b
     */
    public List<Integer> execute(List<Integer> a, List<Integer> b){
        //Definir lista en donde se encontraran el resultado de la union
        List<Integer> c=new ArrayList<Integer>();

        //Añadir todos los elementos de la lista a la lista c
        for (int element :a) {
                    c.add(element);
        }
        //Agregar a la lista c todos los elementos de la lista b siempre y cuando este elemento no se encuentre ya
        //en la lista c
        for (int element:b) {
            if (!c.contains(element)) {
                c.add(element);
            }

        }

        return c;
    }
}
