package co.uk.philharper.patternexamples.strategypattern.dogs;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import co.uk.philharper.patternexamples.strategypattern.dogs.Collie;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CollieTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldHaveLoudBark() {
        var collie = new Collie();

        collie.bark();

        assertThat(outputStreamCaptor.toString().trim(), equalTo("Loud woof"));
    }

}