public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink){
        String text = drink.getText();
        StringBuffer s = new StringBuffer("");
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))){
                s.append(Character.toUpperCase(text.charAt(i)));
            }
            else{
                s.append(Character.toLowerCase(text.charAt(i)));
            }
        }
        drink.setText(s.toString());
    }

}
