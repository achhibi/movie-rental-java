package movierental;

class ChildrensMovie extends Movie{

    ChildrensMovie(String title) {
        super(title);
    }

    double getAmount(int daysRented) {
        if (daysRented > 3)
            return 1.5 + (daysRented - 3) * 1.5;
        return 1.5;
    }
}
