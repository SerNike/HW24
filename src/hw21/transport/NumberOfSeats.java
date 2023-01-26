package hw21.transport;

public enum NumberOfSeats {
   SPECIALLY_SMALL(0, 10),
   SMALL (11, 25),
   AVAREGE (40, 50),
   LARGE (60,80),
    MAX_LARGE (100, 120);

    private final Integer minNumberOfSeats;
    private final Integer maxNumberOfSeats;

    NumberOfSeats(Integer minNumberOfSeats, Integer maxNumberOfSeats) {
        this.minNumberOfSeats = minNumberOfSeats;
        this.maxNumberOfSeats = maxNumberOfSeats;
    }

    public Integer getMinNumberOfSeats() {
        return minNumberOfSeats;
    }

    public Integer getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    @Override
    public String toString() {
        return "Вместимомть от " + minNumberOfSeats + " мест до " + maxNumberOfSeats + " мест";
    }
}