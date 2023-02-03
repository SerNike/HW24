package hw21.transport;

import hw21.transport.Driver.Driver;
import hw21.transport.Exeption.DiagnosticsFaliedException;
import hw21.transport.Mechinal.Mechanic;

import java.util.*;

public abstract class Transport <T extends Driver> {
    private final String brand;
    private final String model;
    private double engineVolume;
    private final T driver;
    private final Set<Mechanic> mechanics = new HashSet<>();

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

    public Set<Mechanic> getMechanics() {
        return mechanics;
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

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public abstract boolean passDiagnostics() throws DiagnosticsFaliedException;

    public abstract void printType();
    @Override
    public String toString() {
        return "Бренд: " + brand + ". Модель: " + model + ". Объем двигателя: " + engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver) && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, mechanics);
    }
}