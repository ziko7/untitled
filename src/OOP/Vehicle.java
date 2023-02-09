package OOP;

public abstract class Vehicle {
    private double toll;
    private double distanceTraveled;

    public Vehicle(double distanceTraveled) {

        this.distanceTraveled = distanceTraveled;
    }
    public double getToll() {
        return toll;
    }
    public void setToll(double toll) {
        this.toll = toll;
    }
    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }
    abstract void calculateToll();
}
