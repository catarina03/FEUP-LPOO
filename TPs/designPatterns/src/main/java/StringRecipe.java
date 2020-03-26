import java.util.List;

public class StringRecipe {
    private List<StringTransformer> transformations;

    public StringRecipe(List<StringTransformer> transformations) {
        this.transformations = transformations;
    }

    public List<StringTransformer> getTransformations() {
        return transformations;
    }

    public void setTransformations(List<StringTransformer> transformations) {
        this.transformations = transformations;
    }

    public void mix(StringDrink drink){
        for (int i = 0; i < transformations.size(); i++){
            transformations.get(i).execute(drink);
        }
    }
}
