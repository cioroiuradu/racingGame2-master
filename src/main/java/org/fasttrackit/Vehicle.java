package org.fasttrackit;

public class Vehicle {
    String name;
    String color;
    double mileage;
    long totalKm;

    // method
    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " accelerated with " + speed +
                " km/h for " + durationInHours + " minutes. ");

        double distance = speed * durationInHours;
        System.out.println("Traveled distance " + distance);
        return distance;



    }
}

// return type poate sa fie void, care nu returneaza nimic
// sau double care trebuie sa returneze ceva

//public
//default sau private package
//void
//private