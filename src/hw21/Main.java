package hw21;

import hw21.transport.Bus.Bus;
import hw21.transport.Bus.NumberOfSeats;
import hw21.transport.Car.BodyType;
import hw21.transport.Car.PassengerCar;
import hw21.transport.Driver.Driver;
import hw21.transport.Driver.DriverB;
import hw21.transport.Driver.DriverC;
import hw21.transport.Driver.DriverD;
import hw21.transport.Exeption.DiagnosticsFaliedException;
import hw21.transport.Mechinal.BodyMechinal;
import hw21.transport.Mechinal.Mechanic;
import hw21.transport.STO;
import hw21.transport.Transport;
import hw21.transport.Truck.LoadCapacity;
import hw21.transport.Truck.Truck;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        DriverB driverB = new DriverB("Иван Иванович Иванов", true, 5);
        DriverC driverC = new DriverC("Петр Петрович Петров", true, 2);
        DriverD driverD = new DriverD("Роман Романович Романов", true, 1);
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
        Mechanic mechanic1 = new Mechanic("Иван Иванович", "Катюша", BodyMechinal.TRUKC);
        Mechanic mechanic2 = new Mechanic("Альберт Андреевич", "Кадрон", BodyMechinal.CAR);
        Mechanic mechanic3 = new Mechanic("Семен Семенов", "Панама", BodyMechinal.BUS);
        Mechanic mechanic4 = new Mechanic("Сергей Сергеевич", "Кадрон", BodyMechinal.ALL);
        Mechanic mechanic5 = new Mechanic("Петр Петрович", "Катюша", BodyMechinal.ALL);
        truck.addMechanic(mechanic1);
        truck.addMechanic(mechanic4);
        bus.addMechanic(mechanic3);
        bus.addMechanic(mechanic5);
        passengerCar.addMechanic(mechanic2);
        passengerCar.addMechanic(mechanic5);

        List<Driver> drivers = new ArrayList<>();
        drivers.add(driverB);
        drivers.add(driverC);
        drivers.add(driverD);

        List<Transport<?>> racers = new ArrayList<>();
        racers.add(passengerCar);
        racers.add(bus);
        racers.add(truck);

        for (Transport<?> transport : racers) {
            System.out.println(transport + " " + transport.getDriver() + " " + transport.getMechanics());
        }
        STO sto = new STO();
        sto.addTransport(passengerCar);
        sto.addTransport(bus);
        sto.addTransport(truck);

//        sto.runTO();
//        sto.runTO();
//        sto.runTO();


        Map<Transport<?>, Mechanic> transportMechanicMap = new HashMap<>();
        for (Transport<?> racer : racers) {
            for (Mechanic mechanic : racer.getMechanics()) {
                transportMechanicMap.put(racer, mechanic);
            }
        }
        System.out.println(transportMechanicMap);
        System.out.println();
        for (Map.Entry<Transport<?>, Mechanic> entry : transportMechanicMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        Set<Driver> setDriver = new HashSet<>(drivers);
        System.out.println(setDriver);

        Iterator<Driver> driverInteger = setDriver.iterator();
        while (driverInteger.hasNext()) {
            System.out.println(driverInteger.next());
        }
    }

    private static void print(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем "
                + transport.getBrand() + " и будет участвовать в заезде");
    }
}
