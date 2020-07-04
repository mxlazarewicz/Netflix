package pl.yellowduck.netflix90.Resources;

public enum Category implements Discontable {
    COMEDY(0, "Sci-Fy"){
        @Override
        public String toString(){
            return "Hahaha";
        }
    },
    DRAMA(5, "SadFilms"),
    HORROR(3,"Scary"),
    MUSICAL(2,"Music"),
    ACTION(5,"Emotional");
    private final int discount;
    private final String description;




    Category(int discount, String description) {
        this.discount = discount;
        this.description = description;
    }

    @Override
    public int discount() {
        return 0;
    }

    public int getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }
}
