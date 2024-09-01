package movierental;

public abstract class Movie {

    private final String title;

    Movie(String title) {
        this.title = title;
    }


    String getTitle() {
        return title;
    }

    abstract double getAmount(int daysRented);

    boolean isNewRelease() {
        return false;
    }
}
