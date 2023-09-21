import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    @Test
    public void test() {
        Conditioner cond = new Conditioner(10);

        Assertions.assertEquals(10, cond.getMinTemperature());
        Assertions.assertEquals(20, cond.getMaxTemperature());
        Assertions.assertEquals(10, cond.getCurrentTemperature());
    }
}
