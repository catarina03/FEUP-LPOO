public class Square implements AreaShape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return Math.pow(side, 2);
    }

    @Override
    public void draw(){
        System.out.println("Square");
    }
}
