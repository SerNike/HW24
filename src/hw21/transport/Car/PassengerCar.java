package hw21.transport.Car;

import hw21.transport.Competing;
import hw21.transport.Driver.DriverB;
import hw21.transport.Exeption.DiagnosticsFaliedException;
import hw21.transport.Transport;

public class PassengerCar extends Transport<DriverB> implements Competing {
    private BodyType bodyType;
    public PassengerCar(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType) {
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
    public boolean passDiagnostics() throws DiagnosticsFaliedException {
        if (getDriver() != null && getDriver().getLicense()) {
            return true;
        } else {
            throw new DiagnosticsFaliedException();
        }
    }

    @Override
    public void printType() {
        if (bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
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

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
