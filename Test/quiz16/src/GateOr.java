public class GateOr extends LogicGate {
    private LogicVariable input1;
    private LogicVariable input2;

    public GateOr(LogicVariable w2, LogicVariable w1, LogicVariable x3) throws ColisionException, CycleException {
        super(w2);
        input1 = w1;
        input2 = x3;

        calculate();

        if (w2.getCalculatedBy() == null) w2.setCalculatedBy(this);
        else throw new ColisionException();

        w2.setFormula(getSymbol() + "(" + w1.getFormula() + "," + x3.getFormula() + ")");
        setOutput(w2);

        Global.inputs.add(input1);
        Global.inputs.add(input2);
        for (LogicVariable var : Global.inputs){
            if (var.equals(w2)){
                throw new CycleException();
            }
        }
    }

    @Override
    public void calculate(){
        output.setValue(getInputs()[0].getValue() || getInputs()[1].getValue());
    }

    @Override
    public LogicVariable[] getInputs() {
        return new LogicVariable[]{input1, input2};
    }

    @Override
    public String getSymbol(){
        return "OR";
    }
}
