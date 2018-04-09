public class Bag {
    private String name;
    private double currentWeight;
    private double maximumWeight;

    public Bag() {
        name = "";
        currentWeight = 0.0;
        maximumWeight = 5.0;
    }
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void addItem(double newWeight) {
        if (newWeight > 0) {
            if (currentWeight + newWeight <= maximumWeight) {
                currentWeight = currentWeight + newWeight;
            }
        }
    }
    public double getCurrentWeight() {
        return currentWeight;
    }
    public void setMaximumWeight(double newMaximumWeight) {
        if (newMaximumWeight > 0) {
            if (newMaximumWeight >= currentWeight) {
                maximumWeight = newMaximumWeight;
            }
        }
    }
    public double getMaximumWeight() {
        return maximumWeight;
    }
}
