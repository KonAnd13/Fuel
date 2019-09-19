/*
Created by Konshin Andrew
*/
public class Fuel {
    public static void main(String[] args) {
        int ConditionalDistance = 100;
        double fuelConsumption = 9.6;
        int currentFuelVolume = 35;

        /*Created a variable "resultingDistance" of type "int" and narrowed the types,
        since an approximate estimate of the distance was required.*/
        int resultingDistance = (int) (currentFuelVolume/fuelConsumption * ConditionalDistance);
        System.out.println(resultingDistance + " km");
    }
}
