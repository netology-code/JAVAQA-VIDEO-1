public class TShirt extends Product {
    private String color;

    public TShirt(int id, String name, int price, String color) {
        super(id, name, price);
        this.color = color;
    }

    @Override
    public void use() {
        System.out.println("Носим футболку " + name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
