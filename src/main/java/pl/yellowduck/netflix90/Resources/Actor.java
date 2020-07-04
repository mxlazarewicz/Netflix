package pl.yellowduck.netflix90.Resources;

public class Actor extends Person {


    public Actor(String firstName, String lastName, Gender gender)  {
        super(firstName, lastName, gender );
    }

    @Override
    public void introduce() {

        switch (this.gender){
            case Male:
            System.out.println("My name is: " + firstName + " " + lastName + " I'm actress.");
            break;
            case Female:
            System.out.println("My name is: " + firstName + " " + lastName + " I'm actor.");
        }



    }
}