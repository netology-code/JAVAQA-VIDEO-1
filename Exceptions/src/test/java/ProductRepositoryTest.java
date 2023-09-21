import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    PurchaseItem item1 = new PurchaseItem(11, 1, "хлеб", 40, 3);
    PurchaseItem item2 = new PurchaseItem(222, 22, "булка", 30, 1);
    PurchaseItem item3 = new PurchaseItem(3, 30, "картошка", 20, 7);

    @Test
    public void test() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        Assertions.assertThrows(NegativeIdException.class, () -> {
            repo.removeById(-100);
        });
    }
}
