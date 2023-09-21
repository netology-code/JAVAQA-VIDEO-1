public class Main {

    public static void main(String[] args) {
        Product book = new Book(
                1,
                "Моя весна",
                200,
                "Александр Шубкин",
                100,
                1947
        );

        book.use();
    }
}
