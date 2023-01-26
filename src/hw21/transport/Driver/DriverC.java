package hw21.transport.Driver;

public class DriverC extends Driver{
    public DriverC(String fullName, boolean license, int experience) {
        super(fullName, license, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории С " + getFullName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории С " + getFullName() + " остановился");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель категории С " + getFullName() + " заправил грузовой автомобиль");
    }
}
