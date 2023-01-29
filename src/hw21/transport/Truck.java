package hw21.transport;

import hw21.transport.Driver.DriverC;
import hw21.transport.Exeption.DiagnosticsFaliedException;

public class Truck extends Transport <DriverC> implements Competing {
    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
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
    public boolean passDiagnostics() throws DiagnosticsFaliedException {
        if (getDriver() != null && getDriver().getLicense()) {
            return true;
        } else {
            throw new DiagnosticsFaliedException();
        }
    }

    @Override
    public void printType() {
        if (loadCapacity != null) {
            System.out.println(loadCapacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
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

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
