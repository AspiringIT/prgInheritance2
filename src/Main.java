// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*Ship, CruiseShip, and CargoShip Classes
Design a Ship class that the following members:
• A field for the name of the ship (a string).
• A field for the year that the ship was built (a string).
• A constructor and appropriate accessors and mutators.
• A toString method that displays the ship’s name and the year it was built.
Design a CruiseShip class that extends the Ship class. The CruiseShip class should have the following members:
• A field for the maximum number of passengers (an int).
• A constructor and appropriate accessors and mutators.
• A toString method that overrides the toString method in the base class. The
CruiseShip class’s toString method should display only the ship’s name and the maxi- mum number of passengers.
Design a CargoShip class that extends the Ship class. The CargoShip class should have the following members:
• A field for the cargo capacity in tonnage (an int).
• A constructor and appropriate accessors and mutators.
• A toString method that overrides the toString method in the base class. The
CargoShip class’s toString method should display only the ship’s name and the ship’s cargo capacity.
Demonstrate the classes in a program that has a Ship array.
Assign various Ship, CruiseShip, and CargoShip objects to the array elements. The program should then step through the array,
 calling each object’s toString method. (See Code Listing 10-25 as an example.)*/

public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
    }
}