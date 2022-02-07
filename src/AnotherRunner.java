import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {
        // create an array with the known types
        String[] intsArray = {"Monk", "End Game", "Sir", "Be right there"};

// use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<String> intList = new ArrayList<String>(Arrays.asList(intsArray));
        System.out.println(intList);


        Car[] cars = {new Car("Ford", 20), new Car("Honda", 999999999),  new Car("BMW", 1)};

        ArrayList<Car> arCar = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(arCar);
    }
}
