package hw21.transport.Driver;

import java.util.Objects;

public abstract class Driver {
    private final String fullName;
    private boolean license;
    private final int experience;

    public Driver(String fullName, boolean license, int experience) {
        this.fullName = fullName;
        this.license = license;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean getLicense() {
        return license;
    }

    public int getExperience() {
        return experience;
    }
    public abstract void startMoving();
    public abstract void stop();
    public abstract void refuelCar();

    @Override
    public String toString() {
        return "Водитель: " + fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return license == driver.license && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, license, experience);
    }
}


