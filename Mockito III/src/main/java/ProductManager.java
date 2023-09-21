public class ProductManager {
    private ProductRepository repo;

    public ProductManager(ProductRepository repo) {
        this.repo = repo;
    }

    public void add(PurchaseItem item) {
        repo.save(item);
    }

    public PurchaseItem[] getItems() {
        PurchaseItem[] all = repo.getItems();
        PurchaseItem[] reversed = new PurchaseItem[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public int getTotal() {
        int sum = 0;
        for (PurchaseItem item : repo.getItems()) {
            sum = sum + item.getCount() * item.getProductPrice();
        }
        return sum;
    }
}
