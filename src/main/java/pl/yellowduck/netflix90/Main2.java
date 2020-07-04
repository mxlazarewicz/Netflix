package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.Resources.*;

import static pl.yellowduck.netflix90.Resources.Gender.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {

        Director tommy = new Director("Tommy", "Wisseu", Gender.Male);
        Actor tommyActor = new Actor("Tommy", "Wisseu", Gender.Male);
        Actor jullie = new Actor("Julliete", "Danielle", Gender.Female);
        Actor greg = new Actor("Greg", "Sestero", Gender.Male);


        Set<Actor> actors = new HashSet<>();

        actors.add(tommyActor);
        actors.add(jullie);
        actors.add(greg);
        VideoCassete theRoom = new VideoCassete("VID001",
                BigDecimal.valueOf(28),
                "The room",
                tommy, Category.DRAMA,
                actors);
        theRoom.printOut();


    }

}

