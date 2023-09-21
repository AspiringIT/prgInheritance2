public class CruiseShip extends Ship {
    private int maxPass;

    public void setMaxPass(int maxPass) {
        this.maxPass = maxPass;
    }

    public int getmaxPass() {
        return maxPass;
    }

    @Override
    public String toString(){
        System.out.println("The Ship's name is " + getShipName() +
                "\nThe Maximum Passenger Capacity is: " + getmaxPass());

        return null;
    }


}



