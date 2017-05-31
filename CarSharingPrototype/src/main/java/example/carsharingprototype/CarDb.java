package example.carsharingprototype;

public class CarDb implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    public static java.util.Map<String,example.carsharingprototype.Car> carDb = new java.util.HashMap<String,example.carsharingprototype.Car>();
    
    public static void createCar(example.carsharingprototype.Car car) {
        carDb.put(car.getLicencePlate(), car);
        System.out.println("Storing car: " + car.toString());
    }
    
    public static void verifyCar(String licencePlate) {
        if (carDb.containsKey(licencePlate)) {
            example.carsharingprototype.Car car = carDb.get(licencePlate);
            System.out.println("Found car: " + car.toString());
            car.setIsVerified(true);
            System.out.println("Verifying Car with licence plate '" + licencePlate + "'");
        } else {
            System.out.println("Car with licencePlate '" + licencePlate + "' doesn't exist");
        }
    }
        
    public static void removeCar(String licencePlate) {
        if (carDb.containsKey(licencePlate)) {
            carDb.remove(licencePlate);
            System.out.println("Car with licence plate '" + licencePlate + "' has been removed");
        } else {
            System.out.println("User with licence plate '" + licencePlate + "' doesn't exist");
        }
    }
    
    static {
        System.out.println("Initializing database");
    }

    public CarDb() {
    }
}
