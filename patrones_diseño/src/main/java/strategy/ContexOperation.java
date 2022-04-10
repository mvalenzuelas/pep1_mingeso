package strategy;

import java.util.List;

public class ContexOperation {
    private OperationStrategy operationStrategy;

    public void setStrategy(OperationStrategy operationStrategy){
        this.operationStrategy=operationStrategy;
    }

    public List<Integer> executeStrategy(List<Integer> a, List<Integer> b){
        return operationStrategy.execute(a,b);
    }



}
