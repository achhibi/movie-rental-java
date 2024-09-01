package movierental;

class RegularMovie extends Movie {

    RegularMovie(String title) {
        super(title);
    }

    double getAmount(int daysRented) {
        if (daysRented > 2)
            return 2 + (daysRented - 2) * 1.5;
        return 2;
    }
}
