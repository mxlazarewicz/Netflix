package pl.yellowduck.netflix90.Resources;

import java.math.BigDecimal;
import java.util.Set;

public class VideoCassete {
    private String id;
    private BigDecimal price;
    private String title;
    private Director director;
    private Category category;
    private Set<Actor> actors;

    public VideoCassete(String id, BigDecimal price, String title, Director director, Category category, Set<Actor> actors) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.director = director;
        this.category = category;
        this.actors = actors;
    }

    public void printOut() {
        StringBuilder builder = new StringBuilder();
        builder.append("|");
        builder.append(this.id);
        builder.append("|");
        builder.append(this.title);
        builder.append("|");
        builder.append(this.price);
        builder.append("|");
        builder.append(this.director.toString());
        builder.append("|");
        builder.append(this.actors);
        builder.append("|");

        System.out.println(builder.toString());
    }
}
