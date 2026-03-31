package vehicle.car;
import vehicle.Vehicle;
import vehicle.Brands;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Car extends Vehicle{
    private short engineSize;
    private byte carDoors;
    private short power;
    private long mileage;

    public Car(Brands brand,  LocalDate dateOfPurchase, int purchasedPrice, short engineSize, byte carDoors, short power, long mileage){
        super(brand,dateOfPurchase, purchasedPrice);
        this.engineSize = engineSize;
        this.carDoors = carDoors;
        this.power = power;
        this.mileage = mileage;
        this.processPriceGuide();
    }

    public void displayCar(){
        this.display();
        System.out.println(String.format("Cylindrée: %s | Nombre de portes: %s | Puissance: %s | Kilométrage: %s km", this.engineSize, this.carDoors, this.power, this.mileage));
    }

    protected void processPriceGuide(){
        long age = (Math.abs(ChronoUnit.DAYS.between(LocalDate.now(), this.dateOfPurchase)) + 1) / 365;
        long wear = this.mileage / 10000;
        this.priceGuide = this.purchasedPrice - (age*0.02*this.purchasedPrice + wear*0.05*this.purchasedPrice);
        if (this.brand == Brands.RENAULT || this.brand == Brands.FIAT){
            this.priceGuide = this.priceGuide - 0.1*this.purchasedPrice;
        }
        else if (this.brand == Brands.FERRARI){
            this.priceGuide = this.priceGuide + 0.2*this.purchasedPrice;
        }
        if (this.priceGuide <= 0){
            this.priceGuide = 0;
        }
    }
}
