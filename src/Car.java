public class Car {
    String model = "";
    int miles = 0;
    public Car(String model, int miles){
        this.miles = miles;
        this.model = model;
    }

    public String toString() {
        return model + " " + miles + "mi";
    }
}
