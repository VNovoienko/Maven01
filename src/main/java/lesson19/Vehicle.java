package lesson19;

public class Vehicle {
    public void print() {
        System.out.println("This is car.");
    }

    class Wheel {
        public void print() {
            System.out.println("This is wheel.");
        }
    }

    class Doors {
        public void print() {
            System.out.println("This is door.");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.print();
        Vehicle.Wheel wheel = vehicle.new Wheel();
        wheel.print();
        Vehicle.Doors doors = vehicle.new Doors();
        doors.print();
    }
}
