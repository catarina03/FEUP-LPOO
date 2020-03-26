public class StringInverter implements StringTransformer {
    public StringInverter() {
    }

    @Override
    public void execute(StringDrink drink){

        StringBuffer s = new StringBuffer(drink.getText());
        drink.setText(s.reverse().toString());
    }

}
