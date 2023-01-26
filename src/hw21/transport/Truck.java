package hw21.transport;

import hw21.transport.Driver.DriverC;

public class Truck extends Transport <DriverC> implements Competing {
    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовой автомобил начал заезд");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовой автомобил финишировал");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобил совершил пит стоп");
    }

    @Override
    public void BestLapTime() {
        int maxSpeed = 180;
        int minSpeed = 140;
        int theBestTime = (int) ((maxSpeed - minSpeed) + maxSpeed + Math.random());
        System.out.println("Лучшее время заезда " + theBestTime);
    }

    @Override
    public void MaxSpeed() {
        int maxSpeed = 180;
        int minSpeed = 140;
        int maxSpeedRound = (int) ((maxSpeed - minSpeed) + maxSpeed + Math.random());
        System.out.println("Максимальная скорость во время прохождения трассы " + maxSpeedRound);
    }
}
