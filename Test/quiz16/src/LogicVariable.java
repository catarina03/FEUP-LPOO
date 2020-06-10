import java.util.Objects;

public class LogicVariable {
    private String name;
    private boolean value;
    private LogicGate calculatedBy;
    private String formula;

    public LogicVariable(String name, boolean value) {
        this.name = name;
        this.value = value;
        this.calculatedBy = null;
        this.formula = name;
    }

    public LogicVariable(String name) {
        this.name = name;
        this.value = false;
        this.calculatedBy = null;
        this.formula = name;
    }

    public String getName() {
        return name;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
        for (LogicVariable var : Global.inputs){
            if (this.getName().equals(var.getName())){
                for (LogicGate gate : Global.gates){
                    for (LogicVariable v : gate.getInputs()){
                        if (v.getName().equals(var.getName())) gate.calculate();
                    }
                }
            }
        }
    }

    public LogicGate getCalculatedBy() {
        return calculatedBy;
    }

    public void setCalculatedBy(LogicGate calculatedBy) {
        this.calculatedBy = calculatedBy;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        return ((LogicVariable) o).getName().equals(this.getName());
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, value);
    }
}
