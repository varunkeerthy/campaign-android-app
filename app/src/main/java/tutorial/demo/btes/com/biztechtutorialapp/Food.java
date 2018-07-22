package tutorial.demo.btes.com.biztechtutorialapp;

public class Food {
    private String name;
    private String description;
    private int imageID;

    public static final Food [] foods = {
            new Food("Pizza", "Thin crust Pizza", R.drawable.pizaa),
            new Food("Burger", "For vegetarians", R.drawable.burger),
            new Food("Sandwich", "For everyone", R.drawable.sandwich),
    };

    public Food (String name, String description, int imageID) {
        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }

    public String getName () { return name; }
    public String getDescription() { return description; }
    public String toString() { return this.name; }

    public int getImageID() {
        return imageID;
    }
}

