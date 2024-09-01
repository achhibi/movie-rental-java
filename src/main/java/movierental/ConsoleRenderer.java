package movierental;

public class ConsoleRenderer implements Renderer {

    @Override
    public String header(String name) {
        return "Rental Record for " +
                name +
                "\n";
    }

    @Override
    public String movie(Rental rental, double amount) {
        return "\t" +
                rental.getMovieTitle() +
                "\t" +
                amount +
                "\n";
    }

    @Override
    public String footer(double totalAmount, int frequentRenterPoints) {
        return "Amount owed is " +
                totalAmount + "\n" +
                "You earned " +
                frequentRenterPoints +
                " frequent renter points";
    }
}
