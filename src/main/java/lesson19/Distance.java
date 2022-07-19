package lesson19;

import java.util.Scanner;

public class Distance {
    private static double distance;

    public void print() {
        System.out.println("Your distance is " + distance + " meters.");
    }

    public static class Converter {
        double miles;
        double kilometers;
        double inches;

        public void convertToMile(double distance) {
            miles = distance * 0.0006213;
            System.out.println("Your distance in meters = " + miles);
        }

        public void convertToKilometers(double distance) {
            kilometers = distance * 0.0010;
            System.out.println("Your distance in  kilometers = " + kilometers);
        }

        public void convertToInches(double distance) {
            inches = distance * 39.3701;
            System.out.println("Your distance in inches = " + inches);
        }

        public static void main(String[] args) {
            Distance.Converter converter1 = new Distance.Converter();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the distance value in meters: ");
            distance = scanner.nextDouble();
            converter1.convertToMile(distance);
            converter1.convertToKilometers(distance);
            converter1.convertToInches(distance);
        }
    }
}
