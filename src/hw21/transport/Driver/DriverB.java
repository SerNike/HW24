package hw21.transport.Driver;

public class DriverB extends Driver{
    public DriverB(String fullName, boolean license, int experience) {
        super(fullName, license, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getFullName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории В " + getFullName() + " остановился");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории В " + getFullName() + " заправил легковой автомобиль");
    }
}
