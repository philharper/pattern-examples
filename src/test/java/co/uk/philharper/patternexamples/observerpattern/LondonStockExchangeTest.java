package co.uk.philharper.patternexamples.observerpattern;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LondonStockExchangeTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldOutputPriceChangesOfStock() {
        TescoStockData tescoStockData = new TescoStockData();

        new LondonStockExchange(List.of(tescoStockData));

        tescoStockData.setPrice(7.15);

        assertThat(outputStreamCaptor.toString().trim(), equalTo("Current TESCO stock price: 7.15"));
    }

    @Test
    void shouldTrackMultipleStockPrices() {
        TescoStockData tescoStockData = new TescoStockData();
        LloydsBankStockData lloydsBankStockData = new LloydsBankStockData();

        new LondonStockExchange(List.of(tescoStockData, lloydsBankStockData));

        tescoStockData.setPrice(7.15);
        lloydsBankStockData.setPrice(3.50);

        var output = outputStreamCaptor.toString().trim();
        assertThat(output.split("\n")[0], equalTo("Current TSCO stock price: 7.15"));
        assertThat(output.split("\n")[1], equalTo("Current LLOY stock price: 3.5"));
    }

}