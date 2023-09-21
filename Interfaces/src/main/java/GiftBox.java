public class GiftBox<T> {
    private T product;
    private String msg;

    public GiftBox(T product, String msg) {
        this.product = product;
        this.msg = msg;
    }

    public T getProduct() {
        return product;
    }

    public void setProduct(T product) {
        this.product = product;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
