import java.util.ArrayList;

public class CombinatorialCircuit {
    private ArrayList<LogicVariable> variables;

    public CombinatorialCircuit() {
        this.variables = new ArrayList<>();
    }

    public boolean addVariable(LogicVariable a) {
        for (LogicVariable var : variables){
            if (a.getName().equals(var.getName())){
                return false;
            }
        }
        variables.add(a);
        return true;
    }

    public LogicVariable getVariableByName(String x1) {
        for (LogicVariable var : variables){
            if (x1.equals(var.getName())){
                return var;
            }
        }
        return null;
    }
}
