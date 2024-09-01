package movierental;

class NewReleaseMovie extends Movie {
    NewReleaseMovie(String title) {
        super(title);
    }

    double getAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    boolean isNewRelease() {
        return true;
    }
}
