package hw21.transport;

import hw21.transport.Driver.Driver;
import hw21.transport.Exeption.DiagnosticsFaliedException;

public abstract class Transport <T extends Driver> {
    private final String brand;
    private final String model;
    private double engineVolume;
    private final T driver;

    public static final double defaultEngineVolume = 1.5;

    public static final String defaultBrand = "default";
    public static final String defaultModel = "default";


    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null || brand.isBlank()) {
            this.brand = defaultBrand;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = defaultModel;
        } else {
            this.model = model;
        }
        this.driver = driver;
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0){
            this.engineVolume = defaultEngineVolume;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public T getDriver() {
        return driver;
    }

    public abstract void startMove();
    public abstract void finishMove();

    public abstract boolean passDiagnostics() throws DiagnosticsFaliedException;

    public abstract void printType();
    @Override
    public String toString() {
        return "Бренд: " + brand + ". Модель: " + model + ". Объем двигателя: " + engineVolume;

    }
}