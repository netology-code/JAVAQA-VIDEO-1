public class Main {

    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();

        try {
            repo.removeById(-100);
            //System.out.println("Hello!");
        } catch (NegativeArraySizeException e) {
            System.out.println("ERROR");
        }


    }
}
