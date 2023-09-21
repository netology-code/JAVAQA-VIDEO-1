import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class ProductManagerTest {

    ProductRepository repo = Mockito.mock(ProductRepository.class);
    ProductManager manager = new ProductManager(repo);

    PurchaseItem item1 = new PurchaseItem(11, 1, "хлеб", 40, 3);
    PurchaseItem item2 = new PurchaseItem(222, 22, "булка", 30, 1);
    PurchaseItem item3 = new PurchaseItem(3, 30, "картошка", 20, 7);

    @Test
    public void shouldSum() {
        PurchaseItem[] items = { item1, item2, item3 };
        doReturn(items).when(repo).getItems();

        int expected = 290;
        int actual = manager.getTotal();

        Assertions.assertEquals(expected, actual);
    }
}
