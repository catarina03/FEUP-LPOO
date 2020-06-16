import java.util.ArrayList;

public abstract class LogicGate {
    protected LogicVariable output;

    public LogicGate(LogicVariable output) {
        this.output = output;
    }

    public void setOutput(LogicVariable output) {
        this.output = output;
    }

    public LogicVariable getOutput(){
        return output;
    }

    public abstract LogicVariable[] getInputs();

    public abstract String getSymbol();

    public String getFormula(){
        return output.getFormula();
    }

    public abstract void calculate();
}
