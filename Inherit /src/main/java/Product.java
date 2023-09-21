public class Product {
    protected int id;
    protected String name;
    protected int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public boolean isTooExpensive() {
        if (price > 1_000_000) {
            return true;
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void use() {
        System.out.println("Продукт " + name + " используется");
    }
}
