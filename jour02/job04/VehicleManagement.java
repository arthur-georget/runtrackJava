import vehicle.EngineType;
import vehicle.Brands;
import vehicle.Vehicle;
import vehicle.car.Car;
import vehicle.plane.Plane;
import java.time.LocalDate;

public class VehicleManagement {
    public static void main(String[] args) {
        LocalDate dateOfPurchase = Vehicle.askDateOfPurchase();
        Car car = new Car(Brands.MAZDA, dateOfPurchase, 9543, (short)8, (byte)5, (short)800, 90000L);
        Plane plane = new Plane(Brands.DAHER, dateOfPurchase, 30000, EngineType.PROPELLER, 2000);
        
        car.displayCar();
        plane.displayPlane();
    }
}
