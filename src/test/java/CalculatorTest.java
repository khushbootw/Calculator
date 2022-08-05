import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void shouldReturnNumberItselfWhenAddedToZero() {

        Calculator calculator = new Calculator();

        int result = calculator.add(2, 0);

        assertEquals(2, result);
    }


}
