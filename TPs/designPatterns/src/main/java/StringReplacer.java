public class StringReplacer implements StringTransformer{
    private Character one;
    private Character two;

    public StringReplacer(Character o, Character t) {
        one = o;
        two = t;
    }

    public Character getOne() {
        return one;
    }

    public void setOne(Character one) {
        this.one = one;
    }

    public Character getTwo() {
        return two;
    }

    public void setTwo(Character two) {
        this.two = two;
    }
    @Override
    public void execute(StringDrink drink){
        String change = drink.getText();
        change = change.replace(this.one, this.two);
        drink.setText(change);
    }
}
