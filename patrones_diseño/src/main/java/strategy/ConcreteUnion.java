package strategy;

import java.util.ArrayList;
import java.util.List;

public class ConcreteUnion implements OperationStrategy {
    public List<int> execute(List<int> a,List<int> b){
        List<int> c=new ArrayList<int>();
        for (int element :a) {
                    c.add(element);
        }
        for (int element:b
             ) {
                c.add(element);

        }

        return c;
    };
}
