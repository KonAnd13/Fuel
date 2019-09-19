/*
Created by Konshin Andrew
*/
public class Fuel {
    public static void main(String[] args) {
        int ConditionalDistance = 100;
        double fuelConsumption = 9.6;
        int currentFuelVolume = 35;

        int resultingDistance = (int) (currentFuelVolume/fuelConsumption * ConditionalDistance);
        System.out.println(resultingDistance + " km");
    }
}
