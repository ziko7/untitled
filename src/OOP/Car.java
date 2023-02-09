package OOP;

public class Car extends Vehicle {

    private boolean hasTrailer;
    private boolean isHov;

    public Car(double distanceTraveled, boolean hasTrailer, boolean isHov) {
        super(distanceTraveled);
        this.hasTrailer = hasTrailer;
        this.isHov = isHov;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public boolean isHov() {
        return isHov;
    }

    public void setHov(boolean hov) {
        isHov = hov;
    }
    public void calculateToll(){
        setToll(getDistanceTraveled()*0.020);
        if (isHov){
            setToll(0);

        }if (hasTrailer){
            setToll((getDistanceTraveled()*0.020)+1);

        }
    }

    @Override
    public String toString() {
        return "Car" + "\t\t\t\t" + getDistanceTraveled() + "\t\t$" + getToll();
    }
}
