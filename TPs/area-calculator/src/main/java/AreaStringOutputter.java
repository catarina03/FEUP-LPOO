public class AreaStringOutputter {
    AreaAggregator areaAggregator;

    public AreaStringOutputter(AreaAggregator areaAggregator) {
        this.areaAggregator = areaAggregator;
    }

    public AreaAggregator getAreaAggregator() {
        return areaAggregator;
    }

    public void setAreaAggregator(AreaAggregator areaAggregator) {
        this.areaAggregator = areaAggregator;
    }

    public String output() {
        return "Sum of areas: " + areaAggregator.sum();
    }
}