import java.util.ArrayList;
import java.util.List;

public class AreaAggregator implements SumProvider{
    private List<HasArea> areaTotal = new ArrayList<>();

    public void addShape(HasArea area) {
        areaTotal.add(area);
    }

    @Override
    public double sum() {
        double sum = 0;
        for (HasArea area : areaTotal) {
            sum += area.getArea();
        }
        return sum;
    }
}

