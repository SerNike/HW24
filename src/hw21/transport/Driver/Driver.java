package hw21.transport.Driver;

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
}


