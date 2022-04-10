package strategy;

import java.util.ArrayList;
import java.util.List;

public class mainStrategy {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<Integer>(List.of(1,2,3));
        List<Integer> b=new ArrayList<Integer>(List.of(2,3,5));

        ContexOperation contexOperation=new ContexOperation();
        contexOperation.setStrategy(new ConcreteUnion());
        List<Integer> c=new ArrayList<>();

        c=contexOperation.executeStrategy(a,b);
        System.out.println("Union de las listas\n"+a.toString()+"\n"+b.toString()+"\n----------------\nRESULTADO\n"+c.toString()+"\n----------------\n");

        contexOperation.setStrategy(new ConcreteInter());
        c=contexOperation.executeStrategy(a,b);
        System.out.println("Intersección de las listas\n"+a.toString()+"\n"+b.toString()+"\n----------------\nRESULTADO\n"+c.toString()+"\n----------------\n");

    }
}
