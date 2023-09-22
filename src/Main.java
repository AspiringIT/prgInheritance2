
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        Ship s = new Ship();
        CruiseShip CruiseBoat = new CruiseShip();
        CargoShip CargoBoat = new CargoShip();
        Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the data for a generic ship." + "\nWhat is the Ship Name?");
    String tempShipName = keyboard.nextLine();
    System.out.println("When was the ship built?");
    String tempShipBuild = keyboard.nextLine();
    s.setShipName(tempShipName);
    s.setShipBuild(tempShipBuild);


        arr.add(CruiseBoat);
        for (int i=0; i<arr.size(); i++) {
            String curr = arr.get(i).toString();

            System.out.println(curr);

        }

    }
}