package movierental;

public class HtmlRenderer implements Renderer {
    @Override
    public String header(String name) {
        return "<h1>Rental Record for " + name + "</h1>\n<table>";
    }

    @Override
    public String movie(Rental rental, double amount) {
        return new StringBuilder()
                .append("<tr><td>")
                .append(rental.getMovieTitle())
                .append("</td><td>")
                .append(amount)
                .append("</td></tr>\n")
                .toString();
    }

    @Override
    public String footer(double totalAmount, int frequentRenterPointsr) {
        return new StringBuilder()
                .append("</table><p>Amount owed is <em>")
                .append(totalAmount)
                .append("</em></p>\n")
                .append("<p>You earned <em>")
                .append(frequentRenterPointsr)
                .append("</em> frequent renter points</p>")
                .toString();

    }
}
