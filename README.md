# prgInheritance2
Ship, CruiseShip, and CargoShip Classes 
* Design a Ship class that the following members: 
  * A field for the name of the ship (a string).  
  * A field for the year that the ship was built (a string).  
  * A constructor and appropriate accessors and mutators.  
  * A toString method that displays the ship’s name and the year it was built.  
  * 
* Design a CruiseShip class that extends the Ship class. The CruiseShip class should have the following members:  
  * A field for the maximum number of passengers (an int).  
  * A constructor and appropriate accessors and mutators.  
  * A toString method that overrides the toString method in the base class. The  CruiseShip class’s toString method should display only the ship’s name and the maxi- mum number of passengers.  
  * 
* Design a CargoShip class that extends the Ship class. The CargoShip class should have the following members: 
  * A field for the cargo capacity in tonnage (an int).  
  * A constructor and appropriate accessors and mutators.  
  * A toString method that overrides the toString method in the base class. 
  
  
The  CargoShip class’s toString method should display only the ship’s name and the ship’s cargo capacity.  Demonstrate the classes in a program that has a Ship array. Assign various Ship, CruiseShip, and CargoShip objects to the array elements. The program should then step through the array, calling each object’s toString method. (See Code Listing 10-25 as an example.)  
