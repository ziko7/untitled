package OOP;

public class PoliceCruiser extends Vehicle {
    public PoliceCruiser (double distanceTraveled){
        super(distanceTraveled);
    }
    public void calculateToll(){
        setToll(0);
    }

    @Override
    public String toString() {
        return "Police Cruiser" + "\t" + getDistanceTraveled() + "\t\t$" + getToll();
    }
    }

