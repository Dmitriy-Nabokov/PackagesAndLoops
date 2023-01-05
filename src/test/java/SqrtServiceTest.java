import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.squares.SqrtService;

public class SqrtServiceTest {

    @ParameterizedTest

/*    @CsvSource({
            "3,200,300",
            "8,200,500",
            "9,300,700",
            "1,200,250"
    })
*/
    @CsvFileSource(files="src/test/resources/SQR.csv")

    public void shouldCalcExact(int expected, int lowerBound, int upperBound) {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(lowerBound, upperBound);

        Assertions.assertEquals(expected, actual);
    }

}
