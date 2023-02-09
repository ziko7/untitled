package OOP;


import java.util.Scanner;

public class Main {
    static int vehicleCounting = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many vehicles would you like to calculate toll for?: ");
        int numberOfVehicles = sc.nextInt();
        Vehicle[] vehicle = new Vehicle[numberOfVehicles];
        do {
            vehicleCounting++;
            System.out.println("Calculating the toll for Vehicle #" + vehicleCounting + "...");
            System.out.println("Choose the vehicle type:");
            System.out.println("1.Car" + "\n" + "2.Track" + "\n" + "3.Police Cruiser");
            int vehicleType = sc.nextInt();

            switch (vehicleType) {
                case 1:
                    System.out.println("Distance traveled: ");
                    double distance = sc.nextDouble();
                    System.out.println("Does it have a trailer?: ");
                    boolean trailer = Boolean.parseBoolean(sc.next());
                    System.out.println("is HOV3+ on?: ");
                    boolean hov = Boolean.parseBoolean(sc.next());
                    vehicle[vehicleCounting - 1] = new Car(distance, trailer, hov);
                    break;
                case 2:
                    System.out.println("Distance traveled: ");
                    distance = sc.nextDouble();
                    System.out.println("How many axles?: ");
                    int axles = sc.nextInt();
                    vehicle[vehicleCounting - 1] = new Truck(distance, axles);
                    break;
                case 3:
                    System.out.println("Distance traveled: ");
                    distance = sc.nextDouble();
                    vehicle[vehicleCounting - 1] = new PoliceCruiser(distance);
                    break;
            }

            vehicle[vehicleCounting - 1].calculateToll();

            System.out.println("TOLL INFO:");
            System.out.println("Vehicle\t\t\tDistance\tToll Amount");
            System.out.println("----------------------------------------");
            System.out.println(vehicle[vehicleCounting - 1]);
            System.out.println();

        } while (numberOfVehicles != vehicleCounting);


        System.out.println();
        System.out.println("TOLL INFO ON ALL VEHICLES:");
        System.out.println();
        System.out.println("Vehicle\t\t\tDistance\tToll Amount");
        System.out.println("----------------------------------------");
        for (Vehicle v : vehicle) {
            System.out.println(v);
        }



        System.out.println("THANK YOU FOR USING THE TAA! GOODBYE!");
    }
}
