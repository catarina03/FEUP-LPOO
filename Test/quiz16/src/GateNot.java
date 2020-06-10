public class GateNot extends LogicGate {
    private LogicVariable input1;

    public GateNot(LogicVariable y1, LogicVariable w2) throws ColisionException, CycleException {
        super(y1);
        input1 = w2;

        calculate();

        if (y1.getCalculatedBy() == null) y1.setCalculatedBy(this);
        else throw new ColisionException();

        y1.setFormula(getSymbol() + "(" + w2.getFormula() + ")");
        setOutput(y1);

        Global.inputs.add(input1);
        for (LogicVariable var : Global.inputs){
            if (var.equals(y1)){
                throw new CycleException();
            }
        }
    }

    @Override
    public void calculate(){
        output.setValue(!(getInputs()[0].getValue()));
    }

    @Override
    public LogicVariable[] getInputs() {
        return new LogicVariable[]{input1};
    }

    @Override
    public String getSymbol(){
        return "NOT";
    }
}
