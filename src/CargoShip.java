public class CargoShip extends Ship {
    private int maxTonnage;

    public void setMaxTonnage(int maxTonnage) {
        this.maxTonnage = maxTonnage;
    }

    public int getMaxTonnage() {
        return maxTonnage;
    }

    @Override
    public String toString() {
    System.out.println("The Ship's name is: " + getShipName() +
            "\nThe maximum cargo capacity is: " + getMaxTonnage() + " Tonnes");
        return "";
    }
}
