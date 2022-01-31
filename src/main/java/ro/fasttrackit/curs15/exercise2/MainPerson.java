package ro.fasttrackit.curs15.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {

        PersonService personService = new PersonService(List.of(
                new Person(1, "Ana", 33),
                new Person(2, "Isabel", 37),
                new Person(3, "Darius", 45),
                new Person(4, "Antonio", 19)
        ));
        System.out.println(personService.getPersons());
       personService.addPerson(new Person(5,"Maria", 24));
        System.out.println(personService.getPersons());
        System.out.println(personService.removePersonId(2));
        System.out.println(personService.getPersonsOlderThan(30));
    }
}
