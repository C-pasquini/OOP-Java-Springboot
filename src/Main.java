public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.year = 1993; // Year is a public variable, meaning that we can access it directly without problems
        car.manufacturer = "FIAT"; /* Manufacturer is a protected variable,
                                    * Meaning we can access it only if the class exists in the same packag (meaning that we can access it even on different files, but they have to be in the same package)*/
        car.model = "Punto"; // Model is a private variable of the class, meaning we can't access it outside of where the class is defined (that is if the class is defined inside a specific file, we can access it only in said file
        car.setModel("Punto"); // This is the way we can access the "model" variable
    }
}
