package hw21.transport.Driver;

public class DriverD extends Driver{
    public DriverD(String fullName, boolean license, int experience) {
        super(fullName, license, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getFullName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории D " + getFullName() + " остановился");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории D " + getFullName() + " заправил автобус");
    }
}
