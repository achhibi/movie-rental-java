package movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name;
    private final List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        rentals = new ArrayList<>();
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }


    public String statement(Renderer renderer) {
        StringBuilder result = new StringBuilder(renderer.header(name));

        double totalAmount = 0;
        for (Rental rental : rentals) {
            double thisAmount = amount(rental);
            result.append(renderer.movie(rental, thisAmount));
            totalAmount += thisAmount;
        }


        return result.append(renderer.footer(totalAmount, calculateRenterPonits()))
                .toString();

    }


    int calculateRenterPonits() {
        return
                rentals.stream().mapToInt(this::renterPoints).sum();

    }



    private int renterPoints(Rental rental) {
        if (rental.getMovie().isNewRelease() && rental.getDaysRented() > 1)
            return 2;
        return 1;
    }

    private double amount(Rental rental) {
        return rental.getAmount(rental.getDaysRented());

    }
}
