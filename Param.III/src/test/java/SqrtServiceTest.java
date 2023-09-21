import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.SqrtService;

public class SqrtServiceTest {

    @Test
    public void shouldCalcExact() {
        SqrtService service = new SqrtService();

        int expected = 5;
        int actual = service.calcSqrt(25);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        SqrtService service = new SqrtService();

        int expected = 6;
        int actual = service.calcSqrt(27);

        Assertions.assertEquals(expected, actual);
    }
}
