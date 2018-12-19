package org.fasttrackit;

/**
 * Hello world!
 */

// this is a comment
public class App {
    public static void main(String[] args) {
        // declaring a variable and instantiating a Car object
        // this is also called initializing a variable
        Car firstCompetitor = new Car(new Engine());
        firstCompetitor.setName("Dacia");
        firstCompetitor.setColor("black");
        firstCompetitor.setdoorCount = 5;
        firstCompetitor.setMileage(9.5);

        // local variables are variables declared inside a method
        // they don't receive default values
        Car secondCompetitor = new Car(new Engine());
        secondCompetitor.setName("Golf");

        Engine firstEngine = new Engine();
        firstEngine.manufacturer = "Renault";

        // sout prints a message to the console
        System.out.println(firstEngine.manufacturer);

        firstCompetitor.engine = firstEngine;

        firstCompetitor.engine.manufacturer = "BMW";

        System.out.println(firstEngine.manufacturer);
        System.out.println(firstCompetitor.engine.manufacturer);

        firstCompetitor.accelerate(100,30);
        double traveledDistance = firstCompetitor.accelerate(100,30);


    }
}
