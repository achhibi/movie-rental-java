package movierental;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static movierental.Movies.*;

public class CustomerTest {

    @Test
    public void shouldRenderCustomerContent() {
        Customer customer = dummyCustomer();

        String expected =
                "Rental Record for Bob\n" +
                        "\tJaws\t2.0\n" +
                        "\tGolden Eye\t3.5\n" +
                        "\tShort New\t3.0\n" +
                        "\tLong New\t6.0\n" +
                        "\tBambi\t1.5\n" +
                        "\tToy Story\t3.0\n" +
                        "Amount owed is 19.0\n" +
                        "You earned 7 frequent renter points";

        String actual = customer.statement(new ConsoleRenderer());

        assertEquals(expected, actual);

    }

    @Test
    public void shouldRenderCustomerHtmlContent() {
        String expected =
                "<h1>Rental Record for Bob</h1>\n" +
                        "<table>" +
                        "<tr><td>Jaws</td><td>2.0</td></tr>\n" +
                        "<tr><td>Golden Eye</td><td>3.5</td></tr>\n" +
                        "<tr><td>Short New</td><td>3.0</td></tr>\n" +
                        "<tr><td>Long New</td><td>6.0</td></tr>\n" +
                        "<tr><td>Bambi</td><td>1.5</td></tr>\n" +
                        "<tr><td>Toy Story</td><td>3.0</td></tr>\n" +
                        "</table>" +
                        "<p>Amount owed is <em>19.0</em></p>\n" +
                        "<p>You earned <em>7</em> frequent renter points</p>";

        String actual = dummyCustomer().statement(new HtmlRenderer());

        assertEquals(expected, actual);

    }

    private static Customer dummyCustomer() {
        Customer customer = new Customer("Bob");
        customer.addRental(new Rental(regular("Jaws"), 2));
        customer.addRental(new Rental(regular("Golden Eye"), 3));
        customer.addRental(new Rental(newRelease("Short New"), 1));
        customer.addRental(new Rental(newRelease("Long New"), 2));
        customer.addRental(new Rental(children("Bambi"), 3));
        customer.addRental(new Rental(children("Toy Story"), 4));
        return customer;

    }
}