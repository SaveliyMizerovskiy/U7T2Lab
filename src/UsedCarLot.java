/**
 * This class represents an inventory object
 *
 * @author Saveliy Mizerovskiy
 */
import java.util.ArrayList;
/** Used car lot constructor */
public class UsedCarLot {
    /** Aa array list  of the of cars */
    private ArrayList<Car> inventory;
    /** A method that sets the inventory param in UsedCarLot object to a new array list */
    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }
    /** Public getter method that returns the inventory array list
     * @return The array list of all car added
     * */
    public ArrayList<Car> getInventory(){
        return inventory;
    }
    /** A public method that adds a new car to the end of the inventory array list
     * <p>
     * PRECONDITION: The new Car object is made correctly and 0 &lt;= indexToAdd &lt; inventory.size()
     * @param newcar A new Car Object
     * */
    public void addCar(Car newcar){
        inventory.add(newcar);
    }
    /** A public method that returns a boolean if the two Car objects swapped places successfully
     * @param first The index of the first car
     * @param second The index of th second car
     * @return Returns a boolean value that indicates if the swap was successful
     * */
    public boolean swap(int first, int second){
        if (first <= inventory.size() && second <= inventory.size() && first >= 0 && second >= 0) {
            Car temp = inventory.set(first, inventory.get(second));
            inventory.set(second, temp);
            return true;
        }
        return false;
    }

    // ADD THESE FOUR NEW METHODS TO UsedCarLot

    /* Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 <= indexToAdd < inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */
    /** A public setter that adds a car to a specific index in the inventory array list
     * <p>
     * PRECONDITION: The new Car object is made correctly
     * @param carToAdd The car object that needs to be added
     * @param indexToAdd The index where the Car objects needs to get added at
     * */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        /* IMPLEMENT ME */
        inventory.add(indexToAdd,carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */
    /** A public getter method that removes a Car object from the inventory array list and returns its memory location also shifts the Car objects appropriately
     * @param indexOfCarToSell  Index of the Car object to remove and return
     * @return Returns the removed Car object's memory location
     * */
    public Car sellCarShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
        return inventory.remove(indexOfCarToSell);
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */

    /** A public getter method that removes a Car object from the inventory array list and returns its memory location and does not shift the Car objects appropriately, instead it places a null value in the index of the remove car object
     * @param indexOfCarToSell  Index of the Car object to remove and return
     * @return Returns the removed Car object's memory location
     * */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
        Car sold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sold;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */
    /** A public void method that moves a Car object from its index to the destinationIndex
     * @param destinationIndex The index of where the Car object is moved to
     * @param indexOfCarToMove The index of the Car object that needs to be moved
     * */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        /* IMPLEMENT ME */
        Car temp = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, temp);

    }

}
