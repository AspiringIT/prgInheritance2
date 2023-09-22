
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();//creates new arrayList named arr
        Ship s = new Ship();//creates new ship object named s
        CruiseShip CruiseBoat = new CruiseShip();//creates new CruiseShip object named CruiseBoat
        CargoShip CargoBoat = new CargoShip();//creates new CargoShip object named CargoBoat
        Scanner keyboard = new Scanner(System.in);//Creates a scanner named keyboard to get user input

        System.out.println("Please enter the data for a generic ship." +
                "\nWhat is the Ship's Name?");
        s.setShipName(keyboard.nextLine());//Sets the name for the ship object s

        System.out.println("When was the ship built?");
        s.setShipBuild(keyboard.nextLine());//sets the shipbuild for the ship object s
        arr.add(s); //adds the object s to the array

        System.out.println("Please enter the data for a Cruise Ship" +
                "\nWhat is the Ship's name?");
        CruiseBoat.setShipName(keyboard.nextLine());//sets name

        System.out.println("What is the Maximum Capacity?");
        CruiseBoat.setMaxPass(keyboard.nextInt());//sets maximum passengers
        arr.add(CruiseBoat);//added to arraylist

        keyboard.nextLine();//consumes the newline character

        System.out.println("Please enter the data for a Cargo Ship" +
                "\nWhat is the Ship's name?");
        CargoBoat.setShipName(keyboard.nextLine());
        if(CargoBoat.getShipName() != null){
        System.out.println("What is the maximum tonnage it can carry?");
        CargoBoat.setMaxTonnage(keyboard.nextInt());
        arr.add(CargoBoat);}

        for (Object i : arr) {
            String curr = i.toString();

            System.out.println(curr);

        }

    }
}