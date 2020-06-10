public class GateAnd extends LogicGate {
    private LogicVariable input1;
    private LogicVariable input2;

    public GateAnd(LogicVariable w1, LogicVariable x1, LogicVariable x2) throws ColisionException, CycleException {
        super(w1);
        input1 = x1;
        input2 = x2;

        calculate();

        if (w1.getCalculatedBy() == null) w1.setCalculatedBy(this);
        else throw new ColisionException();

        w1.setFormula(getSymbol() + "(" + x1.getFormula() + "," + x2.getFormula() + ")");
        setOutput(w1);

        Global.inputs.add(input1);
        Global.inputs.add(input2);
        for (LogicVariable var : Global.inputs){
            if (var.equals(w1)){
                throw new CycleException();
            }
        }
    }

    @Override
    public void calculate(){
        output.setValue(getInputs()[0].getValue() && getInputs()[1].getValue());
    }

    @Override
    public LogicVariable[] getInputs() {
        return new LogicVariable[]{input1, input2};
    }

    @Override
    public String getSymbol(){
        return "AND";
    }

}
