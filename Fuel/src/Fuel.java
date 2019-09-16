/*
Created by Konshin Andrew
*/
public class Fuel {
    public static void main(String[] args) {
        int estimatedDistance = 100;
        double fuelConsumption = 9.6;
        int currentFuelVolume = 35;

        /*Создал переменную resultingDistance типа int и сделал сужение типов,
        так как требовалось приблизительная оценка расстояния.*/
        int resultingDistance = (int) (currentFuelVolume/fuelConsumption * estimatedDistance);
        System.out.println(resultingDistance + " км");
    }
}