package hw21.transport;

public enum LoadCapacity {
    N1(0.0f, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);
    private final Float minWeight;
    private final Float maxWeight;

    LoadCapacity(Float minWeight, Float maxWeigh) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeigh;
    }

    public float getMinWeight() {
        return minWeight;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    @Override
    public String toString() {
        if (maxWeight != null) {
            return "Грузоподъемность от " + minWeight + " тонн до " + maxWeight + " тонн";
        } else {
            return "Грузоподъемность свыше " + maxWeight + " тонн";
        }
    }
}