package co.uk.philharper.patternexamples.strategypattern.dogs;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToyTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void shouldHaveNoBark() {
        var toyDog = new Toy();

        toyDog.bark();

        assertThat(outputStreamCaptor.toString().trim(), equalTo("No woof"));
    }

}