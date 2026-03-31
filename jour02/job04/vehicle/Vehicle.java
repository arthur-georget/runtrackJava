package vehicle;

import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Vehicle {
 
    protected Brands brand;
    protected LocalDate dateOfPurchase;
    protected int purchasedPrice;
    protected double priceGuide;

    public Vehicle(Brands brand, LocalDate dateOfPurchase, int purchasedPrice){
        this.brand = brand;
        this.dateOfPurchase = dateOfPurchase;
        this.purchasedPrice = purchasedPrice;
    }

    protected abstract void processPriceGuide();

    public void display(){
        System.out.println(String.format("Marque: %s | Date d'achat: %s | Prix d'achat: %s | Prix à l'argus: %s", this.brand.name().substring(0,1).toUpperCase() + this.brand.name().substring(1).toLowerCase(), this.dateOfPurchase, this.purchasedPrice, this.priceGuide));
    }

    public static LocalDate askDateOfPurchase() {
        Scanner myScanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.FRENCH);
        LocalDate referenceDate = LocalDate.now();
        LocalDate dateOfPurchase = referenceDate;
        while (dateOfPurchase == referenceDate) {
            System.out.println("Veuillez renseigner la date d'achat du véhicule au format 22/02/1940.");
            try {
                String userInput = myScanner.nextLine();
                dateOfPurchase = LocalDate.parse(userInput, formatter);
            } catch (Exception e) {
                System.out.println("Attention au format!");
            }
        }
        myScanner.close();
        return dateOfPurchase;
    }

}