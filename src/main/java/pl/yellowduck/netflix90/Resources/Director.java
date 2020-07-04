package pl.yellowduck.netflix90.Resources;

public class Director extends Person {
    public Director(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }
    @Override
    public void introduce() {
        System.out.println("My name is: " + firstName + " " + lastName + " I'm director.");

    }
}
