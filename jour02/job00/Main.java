package jour02.job00;

import java.time.LocalDate;

import jour02.job00.person.Person;

public class Main {
    public static void main(String[] args) {
        LocalDate birthDate = Person.askBirthDate();
        Person person = new Person("Arthur", "GEORGET", birthDate, "Tibet", "31 rue de la Paix, Marseille",
                "05423424552");
        System.out.println(String.format("Vous vous appelez %s %s.", person.firstName, person.lastName));
        System.out.println(String.format("Vous êtes né le %s au %s.", person.getBirthDate(), person.getBirthPlace()));
        System.out.println(String.format("Vous habitez au %s.", person.getAddress()));
        System.out.println(String.format("Votre numéro de téléphone est le %s", person.getPhoneNumber()));
        System.out.println(
                "Les attributs publics comme firstName et lastName sont directement accessibles en dehors de la classe Person.");
        System.out.println(
                "Les attributs protected comme birthDate et birthPlace ne sont accessibles directement que dans la class Person, ses classes filles et les classes contenues dans le même paquet.");
        System.out.println(
                "Les attributs privés comme address et phoneNumber ne sont accessibles directement que dans la classe Person.");
        System.out.println(
                "On peut éventuellement utiliser des getters et des setters pour récupérer les attributs privés et protected.");
    }
}
