import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp(){
        sumCalculator = new SumCalculator();
    }

    @ParameterizedTest
    @CsvSource(value = {"1,1", "3,6"})
    void shouldReturnExpectedNumber(int n, int expected){
        int sum = sumCalculator.sum(n);
        Assertions.assertEquals(sum, expected);
    }

    @Test
    void shouldThrowIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
