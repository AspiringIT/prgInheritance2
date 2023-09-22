
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        Ship s = new Ship();
        CruiseShip CruiseBoat = new CruiseShip();
        CargoShip CargoBoat = new CargoShip();
        Scanner keyboard = new Scanner(System.in);
        System.out.println(CargoBoat.getShipName());

        System.out.println("Please enter the data for a generic ship." +
                "\nWhat is the Ship's Name?");
        s.setShipName(keyboard.nextLine());

        System.out.println("When was the ship built?");
        s.setShipBuild(keyboard.nextLine());
        arr.add(s);

        System.out.println("Please enter the data for a Cruise Ship" +
                "\nWhat is the Ship's name?");
        CruiseBoat.setShipName(keyboard.nextLine());

        System.out.println("What is the Maximum Capacity?");
        CruiseBoat.setMaxPass(keyboard.nextInt());
        arr.add(CruiseBoat);

        System.out.println("Please enter the data for a Cargo Ship" +
                "\nWhat is the Ship's name?");
        CargoBoat.setShipName(keyboard.nextLine());
        if(CargoBoat.getShipName() != null){
        System.out.println("What is the maximum tonnage it can carry?");
        CargoBoat.setMaxTonnage(keyboard.nextInt());
        arr.add(CargoBoat);}

        for (int i=0; i<arr.size(); i++) {
            String curr = arr.get(i).toString();

            System.out.println(curr);

        }

    }
}