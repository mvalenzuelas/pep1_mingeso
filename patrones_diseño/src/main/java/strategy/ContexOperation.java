package strategy;

import java.util.List;

public class ContexOperation {
    private OperationStrategy operationStrategy;

    public void setStrategy(OperationStrategy operationStrategy){
        this.operationStrategy=operationStrategy;
    }

    public List<int> executeStrategy(List<int> a, List<int> b){
        return operationStrategy.execute(a,b);
    }



}
