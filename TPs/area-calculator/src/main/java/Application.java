public class Application {
    public static void main(String[] args) {
        AreaAggregator areaAggregator = new AreaAggregator();

        Square square1 = new Square(2);
        Square square2 = new Square(3);
        areaAggregator.add(square1);
        areaAggregator.add(square2);
        double sum1 = areaAggregator.sum();

        AreaStringOutputter stringOutputter1 = new AreaStringOutputter(areaAggregator);
        AreaXMLOutputter xmlOutputter1 = new AreaXMLOutputter(areaAggregator);

        System.out.println(stringOutputter1.output());
        System.out.println(xmlOutputter1.output());

        Circle circle1 = new Circle(2);
        areaAggregator.add(circle1);
        double sum2 = areaAggregator.sum();

        AreaStringOutputter stringOutputter2 = new AreaStringOutputter(areaAggregator);
        AreaXMLOutputter xmlOutputter2 = new AreaXMLOutputter(areaAggregator);

        System.out.println(stringOutputter2.output());
        System.out.println(xmlOutputter2.output());

        Ellipse ellipse1 = new Ellipse(3, 2);
        areaAggregator.add(ellipse1);
        double sum3 =areaAggregator.sum();

        AreaStringOutputter stringOutputter3 = new AreaStringOutputter(areaAggregator);
        AreaXMLOutputter xmlOutputter3 = new AreaXMLOutputter(areaAggregator);

        System.out.println(stringOutputter3.output());
        System.out.println(xmlOutputter3.output());

        House house1 = new House(100);
        areaAggregator.add(house1);

        AreaStringOutputter stringOutputter4 = new AreaStringOutputter(areaAggregator);
        AreaXMLOutputter xmlOutputter4 = new AreaXMLOutputter(areaAggregator);

        System.out.println(stringOutputter4.output());
        System.out.println(xmlOutputter4.output());
    }
}
