package hw21.transport.Bus;

import hw21.transport.Competing;
import hw21.transport.Driver.DriverD;
import hw21.transport.Exeption.DiagnosticsFaliedException;
import hw21.transport.Mechinal.Mechanic;
import hw21.transport.Transport;

public class Bus extends Transport<DriverD> implements Competing {
    private NumberOfSeats numberOfSeats;

    public Bus(String brand, String model, double engineVolume, DriverD driver, NumberOfSeats numberOfSeats) {
        super(brand, model, engineVolume, driver);
        this.numberOfSeats = numberOfSeats;
    }
    @Override
    public void startMove() {
        System.out.println("Автобус начал заезд");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус финишировал");
    }

    @Override
    public boolean passDiagnostics() throws DiagnosticsFaliedException {
        return false;
    }

    @Override
    public void printType() {
        if (numberOfSeats != null) {
            System.out.println(numberOfSeats);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус совершил пит-стоп");
    }

    @Override
    public void BestLapTime() {
        int maxSpeed = 90;
        int minSpeed = 60;
        int theBestTime = (int) ((maxSpeed - minSpeed) + maxSpeed + Math.random());
        System.out.println("Лучшее время заезда " + theBestTime);
    }

    @Override
    public void MaxSpeed() {
        int maxSpeed = 90;
        int minSpeed = 60;
        int maxSpeedRound = (int) ((maxSpeed - minSpeed) + maxSpeed + Math.random());
        System.out.println("Максимальная скорость во время прохождения трассы " + maxSpeedRound);
    }

    public NumberOfSeats getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(NumberOfSeats numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
