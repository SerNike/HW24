package hw21.transport;

import hw21.transport.Driver.DriverD;

public class Bus extends Transport <DriverD> implements  Competing{

    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
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
}
