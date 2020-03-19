import java.util.ArrayList;
import java.util.List;

public class AreaAggregator {
    private List<HasArea> areaTotal = new ArrayList<>();

    public void add(HasArea area) {
        areaTotal.add(area);
    }

    public double sum() {
        double sum = 0;
        for (HasArea area : areaTotal) {
            sum += area.getArea();
        }
        return sum;
    }
}

