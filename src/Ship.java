public class Ship {
    private String ShipName = null;
   private String ShipBuild = null;

    public void setShipName(String Sname){
        ShipName = Sname;

    }

    public void setShipBuild(String Sbuild){
        ShipBuild = Sbuild;
    }

    public String getShipBuild() {
        return ShipBuild;
    }

    public String getShipName() {
        return ShipName;
    }

    public String toString(){
        System.out.println("The Ship's name is: "+ ShipName + "\nThe Ship was built on: " + ShipBuild);
        return "";
    }
}
