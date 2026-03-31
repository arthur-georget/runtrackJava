package vehicle.plane;
import vehicle.Vehicle;
import vehicle.Brands;
import vehicle.EngineType;

import java.time.LocalDate;

public class Plane extends Vehicle{
    
    private EngineType engineType;
    private int flightHours;

    public Plane(Brands brand, LocalDate dateOfPurchase, int purchasedPrice,EngineType engineType, int flightHours){
        super(brand, dateOfPurchase, purchasedPrice);
        this.engineType = engineType;
        this.flightHours = flightHours;
        this.processPriceGuide();
    }

    public void displayPlane(){
        this.display();
        System.out.println(String.format("Type de propulsion: %s | Heures de vol: %s", this.engineType, this.flightHours));
    }

    protected void processPriceGuide(){
        long wear;
        if (this.engineType == EngineType.PROPELLER){
            wear = this.flightHours / 100;
        }
        else{
            wear = this.flightHours / 1000;
        }
        this.priceGuide = this.purchasedPrice - wear*0.01*this.purchasedPrice;
        if (this.priceGuide <= 0){
            this.priceGuide = 0;
        }
    }

}