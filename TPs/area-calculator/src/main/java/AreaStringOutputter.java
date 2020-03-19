public class AreaStringOutputter {
    SumProvider areaAggregator;

    public AreaStringOutputter(SumProvider areaAggregator) {
        this.areaAggregator = areaAggregator;
    }

    public SumProvider getAreaAggregator() {
        return areaAggregator;
    }

    public void setAreaAggregator(SumProvider areaAggregator) {
        this.areaAggregator = areaAggregator;
    }

    public String output() {
        return "Sum of areas: " + areaAggregator.sum();
    }
}
