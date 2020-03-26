public class StringBar extends Bar {
    private boolean happyHour;

    public StringBar() {
        this.happyHour = false;
    }

    @Override
    public boolean isHappyHour(){
        return happyHour;
    }

    @Override
    public void startHappyHour(){
        happyHour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour(){
        happyHour = false;
        notifyObservers();
    }
}
