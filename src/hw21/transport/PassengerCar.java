package hw21.transport;

import hw21.transport.Driver.DriverB;

public class PassengerCar extends Transport <DriverB> implements Competing{
    public PassengerCar(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Легковой автомобил начал заезд");
    }

    @Override
    public void finishMove() {
        System.out.println("Легковой автомобил финишировал");
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобил совершил пит стоп");
    }

    @Override
    public void BestLapTime() {
        int maxSpeed = 120;
        int minSpeed = 90;
        int theBestTime = (int) ((maxSpeed - minSpeed) + maxSpeed + Math.random());
        System.out.println("Лучшее время заезда " + theBestTime);
    }

    @Override
    public void MaxSpeed() {
        int maxSpeed = 120;
        int minSpeed = 90;
        int maxSpeedRound = (int) ((maxSpeed - minSpeed) + maxSpeed + Math.random());
        System.out.println("Максимальная скорость во время прохождения трассы " + maxSpeedRound);
    }
}
