package hw21.transport.Car;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK ("Хетчбек"),
    COUPE ("Купе"),
    STATION_WAGON("Универсал"),
    SUV("Внедорожник"),
    SROSSOVER("Кроссовер"),
    PICKUP_TRUCK("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");


    private final String name;

    BodyType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + name;
    }
}