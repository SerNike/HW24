package hw21;

import hw21.transport.*;
import hw21.transport.Driver.DriverB;
import hw21.transport.Driver.DriverC;
import hw21.transport.Driver.DriverD;
import hw21.transport.Exeption.DiagnosticsFaliedException;

public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Иван Иванович Иванов", true, 5);
        DriverC driverC = new DriverC("Петр Петрович Петров", true, 2);
        DriverD driverD = new DriverD("Роман романович Романов", true, 1);
        PassengerCar passengerCar = new PassengerCar("BMV", "E6", 3.0, driverB, BodyType.SEDAN);
        PassengerCar passengerCar2 = new PassengerCar("BMV", "E6", 3.0, null, BodyType.SEDAN);
        Truck truck = new Truck("Камаз", "6520", 5.0, driverC, LoadCapacity.N2);
        Bus bus = new Bus("Газ", "22171", 6.0, driverD, NumberOfSeats.SMALL);

        try {
            System.out.println(passengerCar.passDiagnostics());
        } catch (DiagnosticsFaliedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(truck.passDiagnostics());
        } catch (DiagnosticsFaliedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(bus.passDiagnostics());
        } catch (DiagnosticsFaliedException e) {
            throw new RuntimeException(e);
        }
    }
    //  private static void print(Transport<?> transport) {
    //    System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем "
    //          + transport.getBrand() + " и будет участвовать в заезде");
    // }
}
