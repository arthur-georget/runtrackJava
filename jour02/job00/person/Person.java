package jour02.job00.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Person {
    public String firstName;
    public String lastName;
    protected LocalDate birthDate;
    protected String birthPlace;
    private String address;
    private String phoneNumber;

    public Person(String firstName,
            String lastName,
            LocalDate birthDate,
            String birthPlace,
            String address,
            String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public String getBirthPlace() {
        return this.birthPlace;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static LocalDate askBirthDate() {
        Scanner myScanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.FRENCH);
        LocalDate referenceDate = LocalDate.now();
        LocalDate userBirthDate = referenceDate;
        while (userBirthDate == referenceDate) {
            System.out.println("Veuillez renseigner votre date de naissance au format 22/02/1940.");
            try {
                String userInput = myScanner.nextLine();
                userBirthDate = LocalDate.parse(userInput, formatter);
            } catch (Exception e) {
                System.out.println("Attention au format!");
            }
        }
        myScanner.close();
        return userBirthDate;

    }
}
