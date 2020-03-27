import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {
    List<StringDrink> drink_waiting;
    List<StringRecipe> recipe_waiting;

    public SmartStrategy() {
        this.drink_waiting = new ArrayList<StringDrink>();
        this.recipe_waiting = new ArrayList<StringRecipe>();
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        if (bar.isHappyHour()){
            bar.order(drink, recipe);
        }
        else {
            drink_waiting.add(drink);
            recipe_waiting.add(recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar){
        for (int i = 0; i < drink_waiting.size(); i++){
            bar.order(drink_waiting.get(i), recipe_waiting.get(i));
        }
        drink_waiting.clear();
        recipe_waiting.clear();
    }

    @Override
    public void happyHourEnded(StringBar bar){

    }

}
