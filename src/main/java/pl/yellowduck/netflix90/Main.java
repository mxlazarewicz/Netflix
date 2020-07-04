package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.Resources.Actor;
import pl.yellowduck.netflix90.Resources.Director;
import pl.yellowduck.netflix90.Resources.Gender;
import pl.yellowduck.netflix90.Resources.Person;

import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    Director tommy = new Director("Tommy", "Wisseu", Gender.Male);
    Actor tommyActor = new Actor("Tommy", "Wisseu", Gender.Male);
    Actor jullie = new Actor("Julliete", "Danielle", Gender.Female);
    Actor greg = new Actor("Greg", "Sestero", Gender.Male);


    Set<Person> persons = new HashSet<>();
    persons.add(tommy);
    persons.add(tommyActor);
    persons.add(jullie);
    persons.add(greg);

    for (Person person: persons)
    {
      person.introduce();

    }

  }

}

