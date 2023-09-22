public class Ship {
    private String ShipName = "Solaris";
   private String ShipBuild = "2023";

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
        System.out.println("The Ship's name is: "+ ShipName + "The Ship was built on: " + ShipBuild);
        return null;
    }
}
